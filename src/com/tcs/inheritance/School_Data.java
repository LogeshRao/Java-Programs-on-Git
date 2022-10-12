package com.tcs.inheritance;

public class School_Data extends Staff_Data{
	private void school_name() {
		System.out.println("School Name : Velammal");
		}
		public static void main(String[] args) {
			School_Data schdata = new School_Data();
			schdata.school_name();
			schdata.staff_Details();
			schdata.student_Name();
			schdata.student_Age();
			schdata.student_Address();
		}
}
