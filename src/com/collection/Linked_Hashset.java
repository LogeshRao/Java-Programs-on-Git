package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {
public static void main(String[] args) {
	Set<Object> hs = new LinkedHashSet<Object>();
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
