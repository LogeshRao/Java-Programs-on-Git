package com.practice;

import java.util.Scanner;

public class Practice_Scannerdemo1 {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter your name : ");
	String nextLine = s.nextLine();
	System.out.println("your name is : "+nextLine);
	System.out.println("enter your age : ");
	byte nextByte = s.nextByte();
	System.out.println("Your age is : "+nextByte);
	System.out.println("enter your id no : ");
	short nextShort = s.nextShort();
	System.out.println("Your id is : "+nextShort);
	System.out.println("enter your roll no : ");
	int nextInt = s.nextInt();
	System.out.println("Your roll no is : "+nextInt);
	System.out.println("enter your mobile no : ");
	long nextLong = s.nextLong();
	System.out.println("your mobile no is : "+nextLong);
	System.out.println("enter your percentage : ");
	float nextFloat = s.nextFloat();
	System.out.println("your percentage is : "+nextFloat);
	System.out.println("enter your cgpa : ");
	double nextDouble = s.nextDouble();
	System.out.println("your cgpa is : "+nextDouble);
	System.out.println("Are u human : ");
	boolean nextBoolean = s.nextBoolean();
	System.out.println("Are u human : "+nextBoolean);
	}
}
