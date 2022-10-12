package com.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tree_Map {
public static void main(String[] args) {
	Map<String, Integer> hm = new TreeMap<String, Integer>();
	hm.put("value1", 100);
	hm.put("value2", 200);
	hm.put("value3", 300);
	hm.put("value4", 400);
	hm.put("value3", 600);
	hm.put("value6", 600);
	hm.put("value7", null);
	hm.put("value6", 800);
	System.out.println(hm);
	boolean containsKey = hm.containsKey("value6");
	System.out.println(containsKey);
	boolean containsValue = hm.containsValue(800);
	System.out.println(containsValue);
	
	/*hm.clear();
	System.out.println(hm);
	System.out.println(hm.isEmpty());*/
	
	Integer integer = hm.get("value4");
	System.out.println(integer);
	Set<String> keySet = hm.keySet();
	System.out.println(keySet);
	for (String string : keySet) {
		System.out.println(string);
	}
	Collection<Integer> values = hm.values();
	System.out.println(values);
	for (Integer integer2 : values) {
		System.out.println(integer2);
	}
	Set<Entry<String, Integer>> entrySet = hm.entrySet();
	System.out.println(entrySet);
	for (Entry<String, Integer> entry : entrySet) {
		System.out.println(entry);
}
}
}
