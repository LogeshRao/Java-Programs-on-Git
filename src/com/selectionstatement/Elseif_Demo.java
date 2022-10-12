package com.selectionstatement;

import java.util.Scanner;

public class Elseif_Demo {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter your age : ");
	int value = s.nextInt();
	System.out.println("your age :"+value);
	
	if (value < 18) {
		System.out.println("not eligible to vote");
	}
	else if (value >= 18 ) {
		System.out.println("eligible to vote");
	}
	}
}
