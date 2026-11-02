package com.campusflow.controller;
import com.campusflow.security.JwtService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController @RequestMapping("/api/auth")
public class AuthController {
 private final JwtService jwt;
 public AuthController(JwtService jwt){this.jwt=jwt;}
 @PostMapping("/login") public Map<String,String> login(@RequestBody Map<String,String> body){
  String u=body.get("username"),p=body.get("password");
  if(!"admin".equals(u)||!"admin123".equals(p)) throw new RuntimeException("Invalid username/password");
  return Map.of("token",jwt.createToken(u,"ADMIN"),"role","ADMIN");
 }
}
