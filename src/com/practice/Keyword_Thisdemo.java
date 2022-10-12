package com.practice;

public class Keyword_Thisdemo extends Keyword_Superdemo {
int a = 100;
private void method_One() {
System.out.println("value of this class : "+this.a);
System.out.println("value of super class : "+super.a);
}
public static void main(String[] args) {
	Keyword_Thisdemo demo = new Keyword_Thisdemo();
	demo.method_One();
}
}
