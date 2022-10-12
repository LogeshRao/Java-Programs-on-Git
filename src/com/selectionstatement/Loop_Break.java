package com.selectionstatement;

public class Loop_Break {
public static void main(String[] args) {
	for (int i = 1; i <= 10; i++) {
		System.out.println(i);
		if (i==6) {
			System.out.println("Loop stops here");
			break;
		}
	}
}
}
