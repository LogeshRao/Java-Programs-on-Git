package com.keyword;

public class Keyword_Return {
private int return_demo() {
int a = 100;
return a;
}
private long return_demo1() {
long b = 120;
return b;
}
public static void main(String[] args) {
	Keyword_Return re = new Keyword_Return();
	int return_demo = re.return_demo();
	System.out.println(return_demo);
	long return_demo1 = re.return_demo1();
	System.out.println(return_demo1);
	
}
}
