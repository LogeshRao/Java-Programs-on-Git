package com.looping;

public class Nested_ForLoop {
public static void main(String[] args) {
	System.out.println("Start\n");
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <=5; j++) {
			System.out.print(j+" ");
		}
		System.out.println("\n");
	}
	System.out.println("End");
}
}
