package com.string.demo;

public class String_Reverse {
public static void main(String[] args) {
	String s = "JAVA LANGUAGE";
	System.out.println("Index Length : "+(s.length()-1));
	for (int i = 12; i >= 0; i--) {
		System.out.print(s.charAt(i));
	}
}
}
