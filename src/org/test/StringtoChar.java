package org.test;

public class StringtoChar {
public static void main(String[] args) {
	String S= "Hello";
	for(int i =0; i<S.length();i++) {
		char ch=S.charAt(i);
		System.out.println("Character at "+i+"Position:" +ch);
	}
}
}
