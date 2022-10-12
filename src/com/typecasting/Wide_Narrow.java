package com.typecasting;

public class Wide_Narrow {
public static void main(String[] args) {
	//widening
	
	byte a = 106;
	int b = a;
	System.out.println("Value for widening : "+b);
	
	//narrowing
	
	int c = 20765;
	short d = (short) c;
	System.out.println("Value for narrowing : "+d);
}
}
