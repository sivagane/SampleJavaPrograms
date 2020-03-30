package org.test;

public class ChartoString {
public static void main(String[] args) {
	char ch='a';
	String str=Character.toString(ch);
	System.out.println("The String is " +str);
	String str1=String.valueOf(ch);
	System.out.println("The String is " +str1);
}
}
