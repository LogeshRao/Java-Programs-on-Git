package com.practice;

public abstract class Practice_Parab1 {
public abstract void method_One();
public abstract void method_two();
private void method_three() {
System.out.println("three");
}
public static void main(String[] args) {
Practice_Parab1 par = new Practice_Parab2();
	par.method_One();
	par.method_two();
	par.method_three();
	}
}
