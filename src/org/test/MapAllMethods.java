package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;

public class MapAllMethods {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> mp=new LinkedHashMap<Integer,String>();
		LinkedHashMap<Integer,String> mpcopy=new LinkedHashMap<Integer,String>();
		mp.put(4, "D");
		mp.put(1, "A");
		mp.put(3, "C");
		mp.put(2, "B");
		mp.put(5, "E");
		
		Object cl = mp.clone();
		System.out.println(cl);
		
		boolean b1 = mp.containsValue("C");
		System.out.println(b1);
		String Value = mp.get(1);
		System.out.println(Value);
		
		boolean b2 = mp.isEmpty();
		System.out.println(b2);
		
		Set<Integer> set = mp.keySet();
		System.out.println(set);
		
		Collection<String> Values = mp.values();
		System.out.println(Values);
		
		mp.remove(2);
	
		mpcopy.put(6,"F");
		mpcopy.put(7,"G");
		mpcopy.putAll(mp);
		System.out.println("The mpcopy contains "+mpcopy);
		
		Set<Entry<Integer, String>> seten = mp.entrySet();
		Iterator<Entry<Integer, String>> itr = seten.iterator();
        while(itr.hasNext()) {
        	Entry<Integer, String> next = itr.next();
        	System.out.println("The Key is "+next.getKey()+" and the Value is "+next.getValue());
        }
	}
}