package com.keyword;

final class Keyword_Final {
	final int b = 200;	
	final void method_One() {
		System.out.println("final method");
	}
	public void method_Two() {
		System.out.println("normal method");
	}
	public static void main(String[] args) {
		Keyword_Final fin = new Keyword_Final();
		fin.method_One();
		fin.method_Two();
		int finVal = fin.b;
		System.out.println("Final value is :"+finVal);
	}
}
