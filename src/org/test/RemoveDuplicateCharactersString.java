package org.test;

public class RemoveDuplicateCharactersString {
public static void main(String[] args) {
	int count,i,j;
	String str1="greatresponsibility";
    String str2="";
    String str3="siblings";
	char[] Strin=str3.toCharArray();
	
	System.out.println("The Duplicate Characters Present in the String is");
	for(i=0;i<Strin.length;i++) {
		count=1;
	
		for(j=i+1;j<Strin.length;j++) {
			if(Strin[i]==Strin[j]&&Strin[j]!=' ') {
				Strin[j]='0';
				count++;
				}
		}
	if(count>1&&Strin[i]!='0') {
		System.out.println(Strin[i]);
	}
	}
}
}
