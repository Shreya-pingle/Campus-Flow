package com.campusflow.structures;
import java.util.*;
public class TaskTrie {
 private static class Node{Map<Character,Node> next=new HashMap<>();boolean end;}
 private final Node root=new Node();
 public void insert(String word){Node n=root;for(char c:word.toLowerCase().toCharArray())n=n.next.computeIfAbsent(c,k->new Node());n.end=true;}
 public List<String> search(String prefix){Node n=root;String p=prefix.toLowerCase();for(char c:p.toCharArray()){n=n.next.get(c);if(n==null)return List.of();}List<String> out=new ArrayList<>();collect(n,new StringBuilder(p),out);return out;}
 private void collect(Node n,StringBuilder s,List<String> out){if(n.end)out.add(s.toString());for(var e:n.next.entrySet()){s.append(e.getKey());collect(e.getValue(),s,out);s.deleteCharAt(s.length()-1);}}
}
