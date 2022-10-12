package Partical_Abstraction;

public abstract class Parent_Ab {
public void student_Data() {		//non abstract method
System.out.println("Student Data");
}
public abstract void staff_Data();	//abstract method
public abstract void principal_Data();	//abstract method
public static void main(String[] args) {
	Parent_Ab Data = new Child_Ab();	//up casting
	Data.student_Data();
	Data.staff_Data();
	Data.principal_Data();
}
}
