package com.string.demo;

public class Buffer_Methods {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Java");
	System.out.println(sb.append(" is"));
	System.out.println(sb.insert(7, " a"));
	System.out.println(sb.replace(0, 4, "JAVA"));
	System.out.println(sb.delete(4, 9));
	System.out.println(sb.reverse());
}
}
