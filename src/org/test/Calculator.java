package org.test;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner reader= new Scanner (System.in);
	System.out.println("Enter two numbers:");
	double first= reader.nextDouble();
	double second=reader.nextDouble();
	System.out.println("Enter the operator:");
	char operator= reader.next().charAt(0);
	double result;
	reader.close();
	switch(operator) {
	case'+':
		result=first+second;
		break;
	case'-':
		result=first-second;
		break;
	case'*':
		result=first*second;
		break;
	case'/':
		result=first/second;
		break;
	default:
		System.out.print("Error!");
		return;
	}
	System.out.println("The Result is " +result);
		
	
	}
	
}

