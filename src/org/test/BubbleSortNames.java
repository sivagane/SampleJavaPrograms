package org.test;

import java.util.Scanner;

public class BubbleSortNames {
public static void main(String[] args) {
	int n,i,j;
	String temp;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Number of names");
	n=s.nextInt();
	String [] str=new String [n];
	System.out.println("Enter the Names one by one");
	for( i=0;i<n;i++) {
		str[i]=s.next();
		}
	s.close();
	for( i=0;i<n;i++) {
		for( j=i+1;j<n;j++) {
			if(str[i].compareTo(str[j])>0){
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			}
		}
	}
	System.out.println("The Sorted String is ");
	for( i=0;i<n;i++) {
		System.out.println(str[i]);
	}
	
	}
}
