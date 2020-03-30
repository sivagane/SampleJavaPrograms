package org.test;

public class DuplicateWordsString {
public static void main(String[] args) {
	String string="Big Buck Black Hole in the Black Sky with Big Clouds";
	int i,j,count;
	
	string=string.toLowerCase();
	String[] words=string.split(" ");
	System.out.println("The Duplicate Words in the String is");
	for(i=0;i<words.length;i++) {
		count=1;
		for(j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])){
				count++;
				words[j]="0";
				}
				}
		if(count>1&&words[i]!="0") {
			System.out.println(words[i]);	
	}
	}
}
}
