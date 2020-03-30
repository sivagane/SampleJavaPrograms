package org.test;

import java.util.Scanner;

public class AdditionofTwoMatrix {
public static void main(String[] args) {
	Scanner mat= new Scanner (System.in);
	System.out.println("Enter the number of Rows:");
	int rows= mat.nextInt();
	System.out.println("Enter the number of Columns:");
	int columns= mat.nextInt();
	int [][]a= new int [rows][columns];
	int [][]b= new int [rows][columns];
	System.out.println("Enter the First Matrix:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			a[i][j]=mat.nextInt();
			}
	}
	System.out.println("Enter the Second Matrix:");
	for (int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			b[i][j]=mat.nextInt();
			}
	}
	mat.close();
	int [][]c=new int [rows][columns];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++){
				c[i][j]=a[i][j]+b[i][j];
				}
}
System.out.println("The Addition of two Matrix is:");
for(int i=0;i<rows;i++) {
	for(int j=0;j<columns;j++) {
		System.out.print(c[i][j]+" " );
	}
	System.out.println();
}
}
}
