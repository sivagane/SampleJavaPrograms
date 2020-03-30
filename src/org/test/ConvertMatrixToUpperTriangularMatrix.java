package org.test;

public class ConvertMatrixToUpperTriangularMatrix {
public static void main(String[] args) {
	int rows,cols,i,j;
	int a[][]= {{1,2,3},
			{4,5,6},
			{7,8,9}};
	rows=a.length;
	cols=a[0].length;
	for(i=0;i<rows;i++) {
		for(j=0;j<cols;j++) {
			if(j>i) {
				System.out.print("0 ");
			}
			else {
				System.out.print(+a[i][j]);
			}
		}
	System.out.println();
	}
	
}
}
