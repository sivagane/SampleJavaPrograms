package org.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MostRepeatedWordinFile {
public static void main(String[] args) {
	String line,word="";
	int i,j,maxcount=0,count;
	List<String> words=new ArrayList<String>();
	
	FileReader file= new FileReader("Greens.txt");
	BufferedReader br=new BufferedReader(file);
	
	if((line=br.readLine())!=null) {
		String string[]=line.toLowerCase().split("[.,\\s+]");
		for (String s : string) {
			words.add(s);
		}
	    for(i=0;i<words.size();i++) {
	    	count=1;
	    	for(j=i+1;j<words.size();j++) {
	    		if(words.get(i).equals(words.get(j))) {
	    			count++;
	    		}
	    	}
	    }
	if(count>maxcount) {
		maxcount=count;
		word=words.get(i);
	}
	System.out.println("The Most Repeated word in the text file is "+word);
	br.close();
	}
	}
}
