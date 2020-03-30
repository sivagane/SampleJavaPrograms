package org.test;

import java.util.Arrays;

public class StringAnagram {
public static void main(String[] args) {
	
	String string1="India";
	String string2="AiNdi";
	
	if(string1.length()!=string2.length()) {
		System.out.println("The Strings are not anagram");
		}
    string1=string1.toLowerCase();
    string2=string2.toLowerCase();
    
    char []str1=string1.toCharArray();
    char []str2=string2.toCharArray();
   
    
    Arrays.sort(str1);
    Arrays.sort(str2);
    
    if(Arrays.equals(str1, str2)==true) {
    	System.out.println("The Strings are Anagram");
    		}
    else {
    	System.out.println("The Strings are not Anagram");
}
    }
}

