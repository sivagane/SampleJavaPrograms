package org.test;

public class StringPalindrome {
public static void main(String[] args) {
	int i;
	String string="Kayak";
	boolean flag=true;
	string=string.toLowerCase();
	
	for(i=0;i<string.length();i++) {
		if(string.charAt(i)!=string.charAt(string.length()-1-i)) {
			flag=false;
			break;
		}
		}
	if(flag) {
		System.out.println("The String is a Palindrome");
	}
	else {
		System.out.println("The Stirng is not a Palindrome");
	}	
}
}
