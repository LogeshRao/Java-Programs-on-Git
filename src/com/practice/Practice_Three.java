package com.practice;

public class Practice_Three extends Practice_One{
public void method_Six() {
System.out.println("six");
}
public static void main(String[] args) {
	Practice_Three p3 = new Practice_Three();
	p3.method_One();
	p3.method_Three();
	p3.method_Four();
	p3.method_Six();
}
}
