package com.practice;

public class Practice_Localvariable {
private void method_One() {
int a = 10;
a = 20;
System.out.println("value of a is : "+a);
}
public static void main (String[] args) {
Practice_Localvariable local = new Practice_Localvariable();
local.method_One();
}
}
