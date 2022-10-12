package com.practice;

public class Practice_Staticvariable {
static int a;
private void method_One() {
System.out.println(a);
}
private void method_Two() {
a = 100;
System.out.println(a);
a=110;
}
public static void main(String[] args) {
	Practice_Staticvariable prast = new Practice_Staticvariable();
	prast.method_One();
	prast.method_Two();
	int b = a;
	System.out.println(b);
	b = 120;
	System.out.println(b);	
}
}
