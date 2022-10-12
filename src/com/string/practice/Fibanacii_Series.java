package com.string.practice;

import java.util.Scanner;

public class Fibanacii_Series {
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c;
		int length_of_string = 10;
//		System.out.println("Enter the length of the series");
//		length_of_string = scan.nextInt();
//		scan.close();
		for (int i = 0; i < length_of_string; i++) {
			System.out.println(a);	//0
			c = a + b;				//1 = 0+1
			a = b;
			b = c;
		}
		
	}

}
