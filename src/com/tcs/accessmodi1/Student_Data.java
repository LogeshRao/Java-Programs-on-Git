package com.tcs.accessmodi1;

public class Student_Data {		//same class
public void student_Name() {
System.out.println("Student Name : Logesh");
}
private void student_Age() {
System.out.println("Student Age : 26");
}
protected void student_Address() {
	System.out.println("Student Address : Erode");
}
void student_Gender() {
	System.out.println("Student Gender : Male");
}
public static void main(String[] args) {
	Student_Data info = new Student_Data();
	info.student_Name();
	info.student_Age();
	info.student_Gender();
	info.student_Address();
}
}
