package com.looping;

public class Practice_ForLoop {
public static void main(String[] args) {
	for(int i = 3; i >= 1; i--) {
		for (int j = i; j <= 3; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	/*System.out.println();
	
	for(int i = 1; i <= 3; i++) {
		for (int j = 1; j <= 3; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}*/
}
}
