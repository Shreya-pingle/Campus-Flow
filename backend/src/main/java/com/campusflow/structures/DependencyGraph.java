package com.campusflow.structures;
import java.util.*;
/** Edge A -> B means B depends on A. */
public class DependencyGraph {
 private final Map<Integer,Set<Integer>> edges=new HashMap<>();
 public boolean addDependency(int a,int b){if(a==b||reachable(b,a))return false;edges.computeIfAbsent(a,k->new HashSet<>()).add(b);return true;}
 private boolean reachable(int start,int target){Set<Integer> seen=new HashSet<>();Deque<Integer> stack=new ArrayDeque<>();stack.push(start);while(!stack.isEmpty()){int n=stack.pop();if(n==target)return true;if(seen.add(n))for(int x:edges.getOrDefault(n,Set.of()))stack.push(x);}return false;}
 public Map<Integer,Set<Integer>> getEdges(){return edges;}
}
