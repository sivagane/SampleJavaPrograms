package org.test;

import java.util.Scanner;

public class DivideStringNequalParts {
public static void main(String[] args) {
	int i,n,len,part,temp=0;
	String string="sivaganesh A";
	len=string.length();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a Number");
	n=s.nextInt();
	s.close();
	String eqstr[]=new String[n];
	part=len/n;
	if(len%n!=0) {
		System.out.println("The String cannot be divided into "+n+"equal parts");
	}
	for(i=0;i<len;i=i+part) {
		String pa=string.substring(i, i+part);
		eqstr[temp]=pa;
		temp++;
	}
System.out.println("The "+n+"equal parts of the Strings are");
for(i=0;i<eqstr.length;i++) {
	System.out.println(eqstr[i]);
}
}
}
