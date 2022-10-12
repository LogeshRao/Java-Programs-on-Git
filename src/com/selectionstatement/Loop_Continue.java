package com.selectionstatement;

public class Loop_Continue {
public static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
		if (i==6) {
			System.out.println("Skips Particular iteration");
			continue;
		}
		System.out.println(i);
	}
}
}
