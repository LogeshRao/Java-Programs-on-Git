package com.polymorphism;

public class Student_Practice {
private void student_Info(String firstname, String lastname) {
System.out.println("Student First Name : "+firstname);
System.out.println("Student Last Name : "+lastname);
}
private void student_Info(int age) {
System.out.println("Student Age : "+age);
}
private void student_Info(String gender) {
System.out.println("Student Gender : "+gender);
}
private void student_Info(String add1, String add2, String add3, int pin) {
System.out.println("Student Address : "+add1);
System.out.println("                : "+add2);
System.out.println("                : "+add3);
System.out.println("        pincode : "+pin);
}
private void student_Info(String fname, char finitial ) {
System.out.println("Fathers Name : "+fname);
System.out.println("Fathers Initial : "+finitial);
}
private void student_Info(char minitial, String mname) {
System.out.println("Mothers Name : "+mname);
System.out.println("Mothers Initial : "+minitial);
}
private void student_Info(long bank) {
System.out.println("Bank A/c No : "+bank);
}
public static void main(String[] args) {
	Student_Practice info = new Student_Practice();
	info.student_Info("Logesh", "Krishnamoorthy");
	info.student_Info(26);
	info.student_Info("Male");
	info.student_Info("No.64", "Sasthri Nagar", "Erode", 638002);
	info.student_Info("Krishnamoorthy", 'B');
	info.student_Info('K', "Latha");
	info.student_Info(686868689689689689l);
}
}
