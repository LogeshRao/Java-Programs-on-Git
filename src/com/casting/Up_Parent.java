package com.casting;

public class Up_Parent {
public void student_Data() {
System.out.println("Student Data");
}
public void staff_Data() {
System.out.println("Staff Data");
}
public static void main(String[] args) {
	Up_Parent parent = new Up_Child();
	parent.staff_Data();
	parent.student_Data();
}
}
