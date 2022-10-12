package Fully_Abstraction;

public class Son implements Father, Mother {

	@Override
	public void mother_Name() {
System.out.println("Mother Name : Latha");		
	}

	@Override
	public void mother_Designation() {
System.out.println("Mother Designation : House Wife");		
	}

	@Override
	public void father_Name() {
System.out.println("Father Name : Krishnamoorthy");		
	}

	@Override
	public void father_Designation() {
System.out.println("Father Designation : Office Superintendent");		
	}
 private void son_Name() {
System.out.println("Son Name : XXXX");
}
 public static void main(String[] args) {
	Son s = new Son();
	s.father_Name();
	s.father_Designation();
	s.mother_Name();
	s.mother_Designation();
	s.son_Name();
}
}
