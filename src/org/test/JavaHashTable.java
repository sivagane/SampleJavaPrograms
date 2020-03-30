package org.test;

import java.util.Hashtable;
import java.util.Set;

public class JavaHashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String>ht= new Hashtable<Integer,String>();
		ht.put(1, "Siva");
		ht.put(2, "Ganesh");
		ht.put(3, "Java");
		ht.put(4, "Selenium");
		
		Hashtable<Integer, String>ht1=new Hashtable<Integer,String>();
		
		ht1=(Hashtable<Integer, String>)ht.clone();
		
		System.out.println(ht);
		System.out.println(ht1);
		
		ht.clear();
		
		System.out.println(ht);
		System.out.println(ht1);
		
		Hashtable<String,Integer> ht2=new Hashtable<String,Integer>();
		ht2.put("Covers", 10);
		ht2.put("Papers", 20);
		ht2.put("Plates", 200);
		ht2.put("Cups", 100);
		
		
		boolean b = ht1.containsKey(1);
		System.out.println(b);
		
		boolean b1 = ht1.containsValue("Java");
		System.out.println(b1);
		
		boolean b2 = ht1.replace(1, "Siva", "sivag");
		System.out.println(b2);
		
		System.out.println(ht1);
        
		ht1.compute(4, (key,val)-> val.substring(0,4)+ "aaa");
		System.out.println(ht1);
		
		ht2.compute("Cups", (key,val)->val +50);
		System.out.println(ht2);
		
		Set<Integer> e = ht1.keySet();
		System.out.println(e);
		
		boolean b3 = ht1.remove(2, "Ganesh");
		System.out.println(b3);
		
	}

}
