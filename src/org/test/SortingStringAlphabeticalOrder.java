package org.test;

import java.util.Scanner;

public class SortingStringAlphabeticalOrder {
public static void main(String[] args) {
	int n,i,j;
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the number of Strings : ");
	n=s.nextInt();
	String temp;
	   String str[]= new String[n];
		System.out.println("Enter the Strings one by one : ");

	for(i=0;i<n;i++) {
		 str[i]=s.nextLine();
	}
	s.close();
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			if(str[i].compareTo(str[j])>0) {
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
	}
	System.out.println("The Sorted array is : ");
	for(i=0;i<n;i++) {
		System.out.print(str[i]+  " ");
		}
}
}

