package com.scannerdemo;

import java.util.Scanner;

public class Scanner_Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age");
	byte age = sc.nextByte();
	System.out.println("Your age is :"+age);
	System.out.println("Enter your Id no");
	short id = sc.nextShort();
	System.out.println("Your ID NO :"+id);
	System.out.println("Enter your pass no");
	int passno = sc.nextInt();
	System.out.println("Your Pass No :"+passno);
	System.out.println("Enter your A/c No");
	long acno = sc.nextLong();
	System.out.println("Your A/c No :"+acno);
	System.out.println("Enter your Percentage");
	float per = sc.nextFloat();
	System.out.println("Your Percentage : "+per);
	System.out.println("Enter your CGPA");
	double cgpa = sc.nextFloat();
	System.out.println("Your CGPA : "+cgpa);
	System.out.println("Are you Human");
	boolean human = sc.nextBoolean();
	System.out.println("You are Human : "+human);
}
}
