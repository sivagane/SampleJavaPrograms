package org.test;

import java.util.Scanner;

public class FactorialofaNumRecursion {
public static void main(String[] args) {
	int num ;
	Scanner s=new Scanner (System.in);
	System.out.println("Enter a number : ");
	num= s.nextInt();
	s.close();
	int factorial=fact(num);
	System.out.println("The Factorial of the number is : "+factorial);
	}
public static  int fact(int n) {
	int o;
	if(n==1) {
		return 1;
	}
	o=n*fact(n-1);
	return o;
			 }

}
	
