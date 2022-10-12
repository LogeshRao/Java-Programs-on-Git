package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("value1", 100);
		hm.put("value2", 200);
		hm.put("value3", 300);
		hm.put("value4", 400);
		hm.put("value2", 600);
		hm.put("value6", 600);
		hm.put("value4", null);
		hm.put(null, 800);
		System.out.println(hm);
		System.out.println(hm.size());
		boolean containsKey = hm.containsKey("value8");
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
