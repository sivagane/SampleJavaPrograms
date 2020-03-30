package org.test;

import java.util.HashSet;
import java.util.Iterator;

public class SetAllMethods {
public static void main(String[] args) {
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	
	Object setc = set.clone();
	System.out.println(setc);
	boolean b = set.contains(20);
	System.out.println(b);
	
	boolean b1 = set.remove(20);
	System.out.println(b1);
	
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
