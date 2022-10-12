package com.tcs.inheritance;

public class Student_Data {

public void student_Name() {
System.out.println("Student Name : Logesh");
}
public void student_Age() {
	System.out.println("Student Age : 26");
}
public void student_Address() {
System.out.println("Student Address : Chennai");
}
public static void main(String[] args) {
	Student_Data info = new Student_Data();
	info.student_Name();
	info.student_Age();
	info.student_Address();
	
}
	}