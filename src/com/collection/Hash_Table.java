package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class Hash_Table {
public static void main(String[] args) {
	Map<String, Integer> hm = new Hashtable<String, Integer>();
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
