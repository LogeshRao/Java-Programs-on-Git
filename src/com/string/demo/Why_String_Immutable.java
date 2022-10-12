package com.string.demo;

public class Why_String_Immutable {
public static void main(String[] args) {
	System.out.println("Why string is immutable");
	String s = "Java";
	System.out.println(s);
	System.out.println(s.concat(" program"));
	System.out.println(s);
	
	System.out.println("Why string Buffer is mutable");
	StringBuffer sb = new StringBuffer("Coding");
	System.out.println(sb);
	System.out.println(sb.append(" Language"));
	System.out.println(sb);
	
	System.out.println("Why string Builder is mutable");
	StringBuilder sr = new StringBuilder("Programming");
	System.out.println(sr);
	System.out.println(sr.append(" Language"));
	System.out.println(sr);
}
}
