package org.test;

public class ToCheckTwoMaticesAreEqual {
public static void main(String[] args) {
	int rows1,cols1,rows2,cols2,i,j;
	boolean flag=true;
	int a[][]= {
			{0,1,2},
			{3,4,5},
			{6,7,8}};
	int b[][]= {{0,1,2},
			{3,4,5},
			{6,7,8}};
	rows1=a.length;
	cols1=a[0].length;
	rows2=b.length;
	cols2=b[0].length;
	if(rows1!=rows2||cols1!=cols2) {
		System.out.println("The Matrices are not Equal");
	}
	for(i=0;i<rows1;i++) {
		for(j=0;j<cols1;j++) {
			if(a[i][j]!=b[i][j]) {
				flag=false;
				break;
			}
		}
	}
	if(flag) {
		System.out.println("The Matrices are Equal");
	}
	else {
		System.out.println("The Matices are not Equal");
	}
}
}

