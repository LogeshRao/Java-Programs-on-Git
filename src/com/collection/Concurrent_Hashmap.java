package com.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Hashmap {
public static void main(String[] args) {
	Map<String, Integer> hm = new ConcurrentHashMap<String, Integer>();
	hm.put("value1", 100);
	hm.put("value2", 200);
	hm.put("value3", 300);
	hm.put("value4", 400);
	hm.put("value2", 600);
	hm.put("value6", 600);
	hm.put("value4", 200);
	hm.put("value8", 800);
	System.out.println(hm);
}
}
