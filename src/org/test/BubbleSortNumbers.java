package org.test;

import java.util.Scanner;

public class BubbleSortNumbers {
	public static void main(String[] args) {
		int n,i,j,temp;
Scanner s = new Scanner (System.in);
System.out.println("Enter a number : ");
n=s.nextInt();
int num[] =new int [n];
System.out.println("Enter the number one by one : ");
for(i=0;i<n;i++) {
num[i]=s.nextInt();
}
for(i=0;i<(n-1);i++) {
	for(j=0;j<n-1-i;j++) {
		while(num[j]>num[j+1]) {
			temp=num[j];
			num[j]=num[j+1];
			num[j+1]=temp;
		}
		}
}
	System.out.println("The Ascending order of numbers is : ");
	for(i=0;i<n;i++) {
		System.out.println(num[i]+ " , ");
		
	}
}
	}

