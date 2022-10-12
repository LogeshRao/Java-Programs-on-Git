package com.array;

public class Array_Dec2 {
public static void main(String[] args) {
	//dataType refName[] = {value1, value2, value3};
//	int a[] = {10,20,30,40,50};
//	System.out.println("Array Length : "+a.length);
//	int index = a.length-1;
//	System.out.println("Array Index : "+index);
//	System.out.println("For Loop");
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
//	System.out.println("For Each");
//	for (int i : a) {
//		System.out.println(i);
//	}
	
	int a[] = {10,20,30,40,50};
	System.out.println(a.length);
	int index = a.length-1;
	System.out.println(index);
	System.out.println(a[3]);
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	for (int print : a) {
		System.out.println(print);
	}
	
}
}
