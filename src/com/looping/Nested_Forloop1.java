package com.looping;

public class Nested_Forloop1 {
	public static void main(String[] args) {
		System.out.println("Start\n");
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
			
			{
				System.out.print(j+" ");
			}
			System.out.println('\n');
		}
		System.out.println("End");
	}
}
