package org.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListinArray {
public static void main(String[] args) {
	LinkedList<String> ali=new LinkedList<String>();
	ali.add("siva");
	ali.add("ganesh");
	ali.add("loves");
	ali.add("java");
	ali.add("and");
	ali.add("selenium");
	
	ali.add(3, "learning");
	
	ali.set(0, "Siva");
	
	int pos = ali.indexOf("and");
	System.out.println(pos);
	
	int len = ali.size();
	System.out.println(len);
	
	boolean b = ali.contains("ganesh");
	System.out.println(b);
	
	for (String string : ali) {
		System.out.println(string);
		
	}
}
}
