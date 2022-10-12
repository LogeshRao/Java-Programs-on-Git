package com.string.demo;

public class Replace_All_String {
public static void main(String[] args) {
	String s = "Jav@#a i$s a Lan%gu&age 0&01";
	s = s.replaceAll("[^A-Za-z0-9 ]","");
	System.out.println(s);
}
}
