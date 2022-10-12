package com.polymorphism;

public class Student_Methodoverriding2 extends Student_Methodoverriding {
@Override
public void student_Id() {
	super.student_Id();
}
@Override
	public void student_Idname(String name) {
		super.student_Idname(name);
	}

public static void main(String[] args) {
	Student_Methodoverriding2 over2 = new Student_Methodoverriding2();
	over2.student_Id();
	over2.student_Idname("Logesh");
}
}