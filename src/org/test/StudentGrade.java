package org.test;

import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args) {
	int n,i;
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the number of Subjects : ");
	n=s.nextInt();
	int mark[]= new int [n];
	float avg, total=0;
	for (i=0;i<n;i++) {
		System.out.println("Enter the mark of subject : "+(i+1));
		mark[i]=s.nextInt();
		total=total+mark[i];
		}
	s.close();
	avg=total/6;
	System.out.println("The Student Grade is : ");
	if(avg>=80) {
		System.out.println("A");
		}
	else
		if(avg>=60&&avg<=80) {
			System.out.println("B");
			}
		else
			if(avg>=40&&avg<=60) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
}
}
