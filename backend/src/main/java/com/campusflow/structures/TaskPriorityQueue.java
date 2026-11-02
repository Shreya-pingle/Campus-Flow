package com.campusflow.structures;
import java.util.*;
/** Simple min-heap: smaller rank means more important. */
public class TaskPriorityQueue {
 private final List<String> heap=new ArrayList<>();
 public void add(String task,int rank){heap.add(rank+":"+task);int i=heap.size()-1;while(i>0){int p=(i-1)/2;if(rankOf(heap.get(p))<=rankOf(heap.get(i)))break;Collections.swap(heap,p,i);i=p;}}
 public String peek(){return heap.isEmpty()?null:heap.get(0).substring(heap.get(0).indexOf(':')+1);}
 public String remove(){if(heap.isEmpty())return null;String top=heap.get(0);String last=heap.remove(heap.size()-1);if(!heap.isEmpty()){heap.set(0,last);int i=0;while(true){int l=2*i+1,r=l+1,b=i;if(l<heap.size()&&rankOf(heap.get(l))<rankOf(heap.get(b)))b=l;if(r<heap.size()&&rankOf(heap.get(r))<rankOf(heap.get(b)))b=r;if(b==i)break;Collections.swap(heap,i,b);i=b;}}return top.substring(top.indexOf(':')+1);}
 private int rankOf(String s){return Integer.parseInt(s.substring(0,s.indexOf(':')));}
}
