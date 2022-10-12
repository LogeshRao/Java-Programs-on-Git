package com.logicaloperator;

import java.util.Scanner;

public class Logical_Andoperator {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value 1 :");
	int value1 = s.nextInt();
	System.out.println("Value 1 is : "+value1);
	System.out.println("Enter the value 2 :");
	int value2 = s.nextInt();
	System.out.println("value 2 is : "+value2);
	if ((value1 == 10)&&(value2 == 20)) {
		System.out.println("valid");
	}
	else {
		System.out.println("invalid");
	}
}
}
