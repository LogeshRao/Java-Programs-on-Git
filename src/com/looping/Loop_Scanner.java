package com.looping;

import java.util.Scanner;

public class Loop_Scanner {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Starting Ponit Number : ");
	int start = s.nextInt();
	System.out.println("Starting Number : "+start);
	System.out.println("Enter Ending Point Number : ");
	int end = s.nextInt();
	System.out.println("Ending Point Number : "+end);
	for (int i = start; i <= end; i++) {
		System.out.println(i);
		i = i+1;		
	}
}
}
