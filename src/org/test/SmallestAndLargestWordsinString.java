package org.test;

public class SmallestAndLargestWordsinString {
public static void main(String[] args) {
	String string="Hardships ofter prepare ordinary people for an extraordinary destiny";
	String small="", large="",word="";
	String [] words=new String [100];
	int length=0,i,k;
	
	
	for(i=0;i<string.length();i++) {
		if(string.charAt(i)!=' ') {
			word=word + string.charAt(i);
		}
		else {
			words[length]=word;
			length++;
			word="";
			}
	
	small=words[0];
	large=words[0];
for(k=0;k<string.length();k++) {
	if(small.length()>words[k].length()) {
		small=words[k];
	}
if(large.length()<words[k].length()) {
	large=words[k];
}
}
	}
System.out.println("The Smallest String is"+small);
System.out.println("The Largest String is"+large);
}
}
