package com.string.demo;

public class String_Manipulation {
public static void main(String[] args) {
	String s = "Java is a programming";
	int length = s.length();
	System.out.println(length);
	int index = length - 1;
	System.out.println(index);
	boolean equals = s.equals("Java is a programming");
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase("java is a programming");
	System.out.println(equalsIgnoreCase);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	char charAt = s.charAt(5);
	System.out.println(charAt);
	/* char charAt1 = s.charAt(25);
	System.out.println(charAt1); */
	int indexOf = s.indexOf('i');
	System.out.println(indexOf);
	/* int indexOf1 = s.indexOf('z');
	System.out.println(indexOf1); */
	int lastIndexOf = s.lastIndexOf('a');
	System.out.println(lastIndexOf);
	/* int lastIndexOf1 = s.lastIndexOf('z');
	System.out.println(lastIndexOf1); */
	int indexOf2 = s.indexOf("a", 5);
	System.out.println(indexOf2);
	boolean contains = s.contains("s");
	System.out.println(contains);
	boolean startsWith = s.startsWith("Ja");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("ng");
	System.out.println(endsWith);
	// trim use sting a = " ";
	String a = "    Java is a coding language     ";
	System.out.println(a);
	String trim = a.trim();
	System.out.println(trim);
	// 
	String replace = s.replace('a', '$');
	System.out.println(replace);
	String concat = s.concat(" Language");
	System.out.println(concat);
	String substring = s.substring(5);
	System.out.println(substring);
	String substring2 = s.substring(13, 17);
	System.out.println(substring2);
	String join = String.join("-", "05", "AUG", "1996");
	System.out.println(join);
	}
}
