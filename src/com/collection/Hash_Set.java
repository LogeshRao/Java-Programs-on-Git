package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
public static void main(String[] args) {
	Set<Object> hs = new HashSet<Object>();
	hs.add(56);
	hs.add(67);
	hs.add("sky");
	hs.add("moon");
	hs.add(67);
	hs.add(null);
	hs.add(56);
	hs.add(null);
	System.out.println(hs);
	
}
}
