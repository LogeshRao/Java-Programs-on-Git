package com.practice;

public class Up_Casting2 {	//parent class
	public void up_One() {
System.out.println("one");
	}
	public static void main(String[] args) {
		Up_Casting2 up = new Up_Casting1();
		up.up_One();
	}
}
