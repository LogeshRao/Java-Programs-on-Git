package com.string.practice;


public class Reverse_String {
	public static void main(String[] args) {
		String s = "MALAYALAM";
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("*****************");
		String ss = "";
		for (int i = s.length()-1; i >= 0; i--) {
			ss = ss + s.charAt(i);
		}
		System.out.println(ss);		
		
		System.out.println();
		System.out.println("*****************");
		
		if (s.equals(ss)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
	
}
