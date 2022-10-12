package com.tcs.inheritance;

public class Principal_Data extends Staff_Data{
	private void principal_Name() {
		System.out.println("Principal Name : Mogesh");
		}
		public static void main(String[] args) {
			Principal_Data prinfo = new Principal_Data();
			prinfo.principal_Name();
			prinfo.staff_Details();
			prinfo.student_Address();
			prinfo.student_Age();
			prinfo.student_Name();
		}
}
