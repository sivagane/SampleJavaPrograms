package org.test;

import java.util.Scanner;

public class AvgofNumusingArray {
public static void main(String[] args) {
	double total=0, avg;
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the Count of number ");
	int n= s.nextInt();
	double []arr=new double[n];
	System.out.println("Enter the numbers one by one:");
    for(int i=0;i<arr.length;i++) {
       System.out.println("The " +(1+i)+" number is : ");
   	     arr[i]=s.nextDouble();
    }
    for(int i=0;i<arr.length;i++) {
		total=total+arr[i];
	}
	avg=total/arr.length;
	System.out.print("The Average of Numbers is : "+avg);
}
}
