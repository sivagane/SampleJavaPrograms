package org.test;

public class IdentityMatrix {
public static void main(String[] args) {
	int rows,cols,i,j;
	boolean flag=true;
	int a[][]= {
			{1,0,0},
			{0,1,0},
			{0,0,1}};
	rows=a.length;
	cols=a[0].length;
	if(rows!=cols) {
		System.out.println("The Matrix should be a square matrix");
	}
	for(i=0;i<rows;i++) {
		for(j=0;j<cols;j++) {
			if(i==j&&a[i][j]!=1) {
				flag=false;
				break;
			}
		if(i!=j&&a[i][j]!=0) {
			flag=false;
			break;
		}
		}
	}
if(flag) {
	System.out.println("The Matrix is a Identity Matrix");
}
else {
	System.out.println("The Matix is not a Identity Matrix");
}
}
}
