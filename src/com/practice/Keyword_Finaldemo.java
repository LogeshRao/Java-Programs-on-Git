package com.practice;

final class Keyword_Finaldemo {
final int a = 100;
final void method_One() {
	System.out.println("one");
}
public static void main(String[] args) {
	Keyword_Finaldemo fin = new Keyword_Finaldemo();
	fin.method_One();
	int value = fin.a;
	System.out.println(value);
}

}
