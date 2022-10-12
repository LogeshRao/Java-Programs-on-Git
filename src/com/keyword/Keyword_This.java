package com.keyword;

public class Keyword_This extends Keyword_Super {
	int a = 300;
private void method_one() {
System.out.println("this class : "+this.a);
System.out.println("super class : "+super.a);
}
public static void main(String[] args) {
	Keyword_This ts = new Keyword_This();
	ts.method_one();
}
}
