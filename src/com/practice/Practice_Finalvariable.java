package com.practice;

public class Practice_Finalvariable {
final int a = 100;
private void method_One() {
System.out.println("Value of a is : "+a);
}
public static void main(String[] args) {
	Practice_Finalvariable fv = new Practice_Finalvariable();
	fv.method_One();
	int value = fv.a;
	System.out.println(value);
	System.out.println(value+value);
}
}
