package com.practice;

public class Practice_Methodoverriding2 extends Practice_Methodoverriding1 {
@Override
	public void method_One(int one) {
System.out.println("over"+one);
}
public static void main(String[] args) {
Practice_Methodoverriding2 mo = new Practice_Methodoverriding2();
mo.method_One(3);
}
}
