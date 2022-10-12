package com.tcs.inheritance;

public class Staff_Data extends Student_Data {
	public void staff_Details() {
		System.out.println("Staff Name : Kavin");
			}

			public static void main (String [] args) {
				
				Staff_Data sfdata = new Staff_Data();
				sfdata.staff_Details();
				sfdata.student_Name();
				sfdata.student_Age();
				sfdata.student_Address();
				}
}
