package org.test;

public class LargestnoinArray {
public static void main(String[] args) {
	double numarray[]= {12.0,24.5,42.2,11.6,32.5};
	double largest= numarray[0];
	for(double num: numarray){
	if( largest < num) 
		largest=num;
		}
	System.out.println("The Largest number is " +largest);
	}
}

