package org.test;

public class SparseMatrix {
public static void main(String[] args) {
	int rows,cols,i,j,size,count=0;
	int a[][]= {
			{0,0,1},
			{1,8,0},
			{0,0,2}};
	rows=a.length;
	cols=a[0].length;
	size=rows*cols;
	for(i=0;i<rows;i++) {
		for(j=0;j<cols;j++) {
			if(a[i][j]==0) {
				count++;
			}
		}
	}
if(count>size/2) {
	System.out.println("The Matrix is a Sparse Martix");
}
else {
	System.out.println("The Matrix is not a Sparse Matrix");
}
}
}
