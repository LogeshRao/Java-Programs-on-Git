package com.selectionstatement;

import java.util.Scanner;

public class Switch_Statement {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value :");
	int value = s.nextInt();
	System.out.println("Your Entered value is : "+value);
	switch (value) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
	case 5:
		System.out.println("five");

	default:
		System.out.println("invalid input data");
		break;
	}
}
}
