package com.practice;

public class Practice_Classvariable {
int a;
private void method_One() {
System.out.println("value of a is : "+a);
}
private void method_Two() {
a = 100;
System.out.println("changed a value is : "+a);
}
public static void main(String[] args) {
	Practice_Classvariable cls = new Practice_Classvariable();
	cls.method_One();
	cls.method_Two();
	int bval = cls.a;
	System.out.println(bval);
	System.out.println(bval+bval+100);
}
}
