package com.practice;

public class Keyword_Staicdemo {
static int a = 100;
private static void method_One() {
System.out.println("one");
}
static {
	System.out.println("static block");
}
public static void main(String[] args) {
	method_One();
	int value = a;
	System.out.println(value);
}
}
