package com.string.practice;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
//		String s = "madam";
//		String ss = "";
//		for (int i = s.length()-1; i >= 0; i--) {
//			ss = ss + s.charAt(i);
//		}
//		System.out.println(ss);
//		
//		if (s.equals(ss)) {
//			System.out.println("it is a palindrome");
//		}
//		else {
//			System.out.println("it is not a palindrome");
//		}
//		for (int i = 1; i <= 3; i++) {
//			for (int j = i; j <= 3; j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		String name1 = "";
		for (int i = name.length()-1; i >= 0; i--) {
			name1 = name1+name.charAt(i);
		}
		System.out.println(name1);
		s.close();
		if (name.equals(name1)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		}
	
	
	
	}
	
	

