package com.practice;

public class Practice_Fuab3 implements Practice_fuab1, Practice_Fuab2{
public void son_Name() {
System.out.println("logesh");
}

public static void main(String[] args) {
	Practice_Fuab3 son = new Practice_Fuab3();
	son.father_Name();
	son.mother_Name();
	son.son_Name();
}

@Override
public void mother_Name() {
System.out.println("latha");	
}

@Override
public void father_Name() {
System.out.println("krishna");	
}
}
