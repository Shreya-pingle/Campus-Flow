package com.campusflow.security;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
@Service
public class JwtService {
 @Value("${app.jwt.secret}") private String secret;
 @Value("${app.jwt.expiration-ms}") private long expiration;
 private SecretKey key(){return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));}
 public String createToken(String username,String role){
  long now=System.currentTimeMillis();
  return Jwts.builder().subject(username).claim("role",role).issuedAt(new Date(now))
   .expiration(new Date(now+expiration)).signWith(key()).compact();
 }
 public String username(String token){return Jwts.parser().verifyWith(key()).build().parseSignedClaims(token).getPayload().getSubject();}
 public String role(String token){return Jwts.parser().verifyWith(key()).build().parseSignedClaims(token).getPayload().get("role",String.class);}
}
