package com.polymorphism;
// method overloading
public class Student_Details {
private void student_Data(String firstname, String lastname) {
System.out.println("Student First Name : "+firstname);
System.out.println("Student Last Name : "+lastname);
}
private void student_Data(int age) {
System.out.println("Student Age : "+age);
}
private void student_Data(String gender) {
System.out.println("Student Gender : "+gender);
}
private void student_Data(String address, String add1line, String add2line, int pincode) {
System.out.println("Student Address : "+address);
System.out.println("                  "+add1line);
System.out.println("                  "+add2line);
System.out.println("        Pincode : "+pincode);
}
private void student_Data(String fname, char finitial) {
System.out.println("Fathers Name : "+fname);
System.out.println("Fathers Initial : "+finitial);
}
private void student_Data(char minitial, String mname) {
System.out.println("Mothers Name : "+mname);
System.out.println("Mothers Initial : "+minitial);
}
private void student_Data(long bankac) {
System.out.println("Bank A/c No : "+bankac);
}
public static void main(String[] args) {
	Student_Details info = new Student_Details();
	info.student_Data("Logesh", "Krishnamoorthy");
	info.student_Data(26);
	info.student_Data("Male");
	info.student_Data("No.64", "Sasthrinagar", "Erode", 638002);
	info.student_Data("Krishnamoorthy", 'B');
	info.student_Data('K', "Latha");
	info.student_Data(89789798473897897l);
}
}
