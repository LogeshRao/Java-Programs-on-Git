package com.scannerdemo;

import java.util.Scanner;

public class Scanner_String {
public static void main(String[] args) {
	Scanner str = new Scanner(System.in);
	System.out.println("Enter your Fullname");
	String fullname = str.nextLine();
	System.out.println("Your Fullname :"+fullname);
	System.out.println("Enter your Name");
	String name = str.next();
	System.out.println("Your Name : "+name);
}
}
