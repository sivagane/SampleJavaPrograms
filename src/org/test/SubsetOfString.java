package org.test;

public class SubsetOfString {
public static void main(String[] args) {
	int i,j,temp=0;
	String string="Fortunate";
	string=string.toLowerCase();
	int len=string.length();
	String[] subset=new String[len*(len+1)/2];
	for(i=0;i<len;i++) {
		for(j=i;j<len;j++) {
			String sub=string.substring(i, j+1);
			subset[temp]=sub;
				temp++;
			}
		}
	System.out.println("The Subset of the String is");
	for(i=0;i<subset.length;i++) {
		System.out.println(subset[i]);
}
}
}