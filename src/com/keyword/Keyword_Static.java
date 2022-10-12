package com.keyword;

public class Keyword_Static {
	static int a = 100;
public static void method_One() {
System.out.println("method one");
}
static {
	System.out.println("Static Keyword");
}
public static void main(String[] args) {
	method_One();
	int value = a;
	System.out.println(value);	
}
}
