package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
public static void main(String[] args) {
	List<Object> lis = new ArrayList<Object>();
	lis.add(23);
	lis.add(null);
	lis.add("Logesh");
	lis.add(56);
	lis.add("sky");
	lis.add(null);
	lis.add(46);
	lis.add("moon");
	lis.add(null);
	lis.add(96);
	lis.add("star");
	System.out.println(lis);
	System.out.println("Using for loop");
	for (int i = 0; i < lis.size(); i++) {
		System.out.println(lis.get(i));
	}
	System.out.println("Using foreach");
	for (Object object : lis) {
		System.out.println(object);
	}
	int size = lis.size();
	System.out.println(size);
	int index = size-1;
	System.out.println(index);
	int indexOf = lis.indexOf("Logesh");
	System.out.println(indexOf);
	int lastIndexOf = lis.lastIndexOf(null);
	System.out.println(lastIndexOf);
	boolean contains = lis.contains(46);
	System.out.println(contains);
	Object toget = lis.get(4);
	System.out.println(toget);
	lis.set(4, "dark");
	System.out.println(lis);
	
	// lis.clear();
	System.out.println(lis.isEmpty());
	
	List<Object> lis1 = new ArrayList<Object>();
	lis1.add(67);
	lis1.add("sun");
	lis1.add(null);
	lis1.add(96);
	
	//lis.addAll(lis1);
	//System.out.println(lis);
	
	//lis1.retainAll(lis);
	//System.out.println(lis1);
	//System.out.println(lis);
	
	//lis.removeAll(lis1);
	//System.out.println(lis);
	lis.remove(4);
	System.out.println(lis);
	Object[] array = lis.toArray();
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	String string = lis.toString();
	System.out.println(string);
	System.out.println(string.length());
	
	
}
}
