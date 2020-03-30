package org.test;

import java.util.Scanner;

public class ReversingArray {
public static void main(String[] args) {
	int count,i=0,j=0,temp;
	int number[]=new int[100];
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the count of number: ");
	count = s.nextInt();
	System.out.println("Enter the numbers :");
	for(i=0;i<=count-1;i++) {
		number[i]=s.nextInt();
	}
	for(i=0;i<count;i++) {
		for(j=i+1;j<count;j++) {
		temp=number[i];
		number[i]=number[j];
		number[j]=temp;
		}
	}
	System.out.println("The Reversed Array is " );
	for(i=0;i<=count-1;i++) {
		System.out.print(number[i]+ " ");
	}
}

}
