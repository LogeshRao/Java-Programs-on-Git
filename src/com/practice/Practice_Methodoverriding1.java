package com.practice;

public class Practice_Methodoverriding1 {
public void method_One(int one) {
System.out.println("one"+one);
}
public void method_Two(String two) {
System.out.println("two"+two);
}
public static void main(String[] args) {
	Practice_Methodoverriding1 m1 = new Practice_Methodoverriding2();
m1.method_One(3);
}
}

