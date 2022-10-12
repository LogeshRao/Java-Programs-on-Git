package com.string.demo;

public class String_Split {
public static void main(String[] args) {
	String s = "Java is a Programming Language";
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	String[] split2 = s.split("");
	for(int i =0; i < split2.length; i++) {
		System.out.println(split2[i]);
	}
}
}

