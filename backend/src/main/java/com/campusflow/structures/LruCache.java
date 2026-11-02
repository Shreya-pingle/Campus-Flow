package com.campusflow.structures;
import java.util.*;
/** LinkedHashMap in access-order is the simplest standard-library LRU implementation. */
public class LruCache<K,V> extends LinkedHashMap<K,V> {
 private final int capacity;
 public LruCache(int capacity){super(capacity,0.75f,true);this.capacity=capacity;}
 @Override protected boolean removeEldestEntry(Map.Entry<K,V> eldest){return size()>capacity;}
}
