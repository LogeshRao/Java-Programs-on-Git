package com.practice;

public class Practice_Overloading {
private void student_Data(String name) {
System.out.println("Student Name : "+name);
}
private void student_Data(char ini) {
System.out.println("Student Initial : "+ini);
}
private void student_Data(int age) {
System.out.println("Student Age : "+age);
}
private void student_Data(long id) {
System.out.println("Student ID : "+id);
}
private void student_Data(float per) {
System.out.println("Student Percentage : "+per);
}
private void student_Data(boolean boo) {
System.out.println("Student Data is : "+boo);
}
public static void main(String[] args) {
	Practice_Overloading po = new Practice_Overloading();
	po.student_Data("LOGESHWARA RAO");
	po.student_Data('K');
	po.student_Data(26);
	po.student_Data(5678l);
	po.student_Data(86.88f);
	po.student_Data(true);
}
}
