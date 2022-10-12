package com.string.practice;

public class Swap_Number {
	public static void main(String[] args) {
		//using two variable
		int a = 20;
		int b = 10;
		
		a = a+b;	// 30 = 20+10
		b = a-b;	// 20 = 30-10
		a = a-b;	//10 = 30-20
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
		
		//using three variable
		int x = 40;
		int y = 50;
		int z;
		z = x+y; 	// 90 = 40+50
		x = z-x; 	// 50 = 90-40
		y = z-x; 	// 40 = 90-50
		System.out.println(x);
		System.out.println(y);
	}

}
