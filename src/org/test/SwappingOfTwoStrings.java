package org.test;

public class SwappingOfTwoStrings {
public static void main(String[] args) {
	String str1="Good";
	String str2="morning";
	str1=str1.concat(str2);
	str2=str1.substring(0,(str1.length()-str2.length()));
	str1=str1.substring(str2.length());
	System.out.println("The String After Swapping is");
	System.out.println("String 1 "+str1);
	System.out.println("String 2 "+str2);
}
}
