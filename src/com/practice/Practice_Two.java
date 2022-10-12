package com.practice;

public class Practice_Two extends Practice_One{
public void method_Five() {
System.out.println("five");
}
public static void main(String[] args) {
	Practice_Two p2 = new Practice_Two();
	p2.method_One();
	p2.method_Three();
	p2.method_Four();
	p2.method_Five();
}
}
