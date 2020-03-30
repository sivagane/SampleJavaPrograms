package org.test;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int num,item, counter;
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the count of numbers : ");
	counter = s.nextInt();
	int array[]= new int [counter];
	
	System.out.println("Enter the number of elements : ");
	for (int i=0;i<counter;i++) {
		array[i]=s.nextInt();
		}
	System.out.println("Enter the search element : ");
	item=s.nextInt();
	
	for(num=0;num<counter;num++) {
		if(array[num]==item) {
			System.out.print("The Number is Inside the array");
			break;
		}
	}
	if(num==counter) {
		
			System.out.print("The Number is not in the array");
		}
	}
}

