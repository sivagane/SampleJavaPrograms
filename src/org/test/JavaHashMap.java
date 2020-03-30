package org.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashMap {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	hm.put(1, "Siva");
	hm.put(2, "Ganesh");
	hm.put(3, "Java");
	hm.put(4, "Selenium");
	
	boolean b = hm.containsValue("Siva");
	System.out.println(b);
	
	Set<Entry<Integer, String>> s2 = hm.entrySet();
	System.out.println(s2);
	
	hm.compute(1, (key,val)-> val.substring(0, 4)+ "ganesh");
	System.out.println(hm);
	
	System.out.println(hm.hashCode());
	
	Class<? extends HashMap> c = hm.getClass();
	System.out.println(c);
	
	boolean b3 = hm.remove(3, "Java");
	System.out.println(b3);
	
	System.out.println(hm);
	boolean b1 = hm.containsKey(1);
	System.out.println(b1);
	
	String s1 = hm.get(1);
	System.out.println(s1);
	
	boolean b2 = hm.replace(1, "Sivaganesh","Siva");
	System.out.println(b2);
	
	System.out.println(hm);
	
	HashMap<Integer,Employee>hm2=new HashMap<Integer,Employee>();
	
	Employee e7=new Employee("siva", 20, "8/9/19990", 25000.23);
	Employee e8=new Employee("Ganesh", 25,"8/9/1990", 30000.23);
	Employee e9=new Employee("Selenium", 25, "0/0/0000", 25000.23);
	
	hm2.put(1, e7);
	hm2.put(2, e8);
	hm2.put(3, e9);
	
 for (Entry<Integer, Employee> e : hm2.entrySet()) {
	Integer k = e.getKey();
	Employee v = e.getValue();
	System.out.println("Employee "+k+" Info");
	System.out.println(v.name+" "+v.age+" "+v.DOB+" "+v.Salary);
	
}

}
}
