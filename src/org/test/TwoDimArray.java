package org.test;

public class TwoDimArray {
public static void main(String[] args) {
	String a[][]=new String [4][4];
	
	System.out.println(a.length);
	System.out.println(a[0].length);
	
	a[0][0]="siva";
    a[0][1]="ganesh";
    a[0][2]="is";
    a[0][3]="writing";
    
    a[1][0]="Java";
    a[1][1]="program";
    a[1][2]="and";
    a[1][3]="he";
    
    a[2][0]="wants";
    a[2][1]="to become";
    a[2][2]="professional";
    a[2][3]="in Java programming";
    		
    a[3][0]="and";
    a[3][1]="in";
    a[3][2]="Selenium";
    a[3][3]="concepts.";
    
    for(int i=0;i<a.length;i++) {
    	for(int j=0;j<a[0].length;j++) {
    		System.out.println(a[i][j]);
    	}
    }
}
}
