package com.array;

public class Array_Forloop {
	public static void main(String[] args) {
		// dataType refName[] = new dataType [length]; 
		int a[] = new int[5];
		// refName[index] = Value;
		a[0]=10;
		a[1]=20;
		a[3]=40;
		a[4]=50;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
