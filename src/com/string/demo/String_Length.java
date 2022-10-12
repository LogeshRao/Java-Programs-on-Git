package com.string.demo;

public class String_Length {
public static void main(String[] args) {
	System.out.println("String Length");
	String s = "Java";
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	String s1 = "Java";
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	String s2 = "java";
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
	String concat = s.concat(s1);
	System.out.println(concat);
	System.out.println(System.identityHashCode(concat));
	System.out.println("String Buffer Length");
	StringBuffer sb = new StringBuffer("Program");
	System.out.println(sb);
	System.out.println(System.identityHashCode(sb));
	StringBuffer sb1 = new StringBuffer("Program");
	System.out.println(sb1);
	System.out.println(System.identityHashCode(sb1));
	StringBuffer append = sb.append(sb1);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	StringBuffer append2 = sb1.append(sb);
	System.out.println(append2);
	System.out.println(System.identityHashCode(append2));
	System.out.println("String Builder Length");
	StringBuilder sbb = new StringBuilder("Green");
	System.out.println(sbb);
	System.out.println(System.identityHashCode(sbb));
	StringBuilder sbb1 = new StringBuilder("Green");
	System.out.println(sbb1);
	System.out.println(System.identityHashCode(sbb1));
	StringBuilder append3 = sbb1.append(sbb);
	System.out.println(append3);
	System.out.println(System.identityHashCode(append3));
	StringBuilder append4 = sbb.append(sbb1);
	System.out.println(append4);
	System.out.println(System.identityHashCode(append4));
	}
}
