package org.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class JavaHashSet {
	
	public static <E> void main(String[] args) {
		HashSet<E> hs=new HashSet<E>();
		
		Employee e10=new Employee("Java", 20, "03/03/03", 20000.23);
		Employee e11=new Employee("Selenium", 25, "06/06/06", 40000.43);
		Employee e12=new Employee("TestNg", 30, "09/09/09", 60000.63);
		
		
		HashSet<Employee>hs1=new HashSet<Employee>();
		hs1.add(e10);
		hs1.add(e11);
		hs1.add(e12);
		
		for (Employee e : hs1) {
			System.out.println(e.name+" "+e.age+" "+e.DOB+" "+e.Salary);
					}
	
	HashSet<Integer>hs2=new HashSet<Integer>();
	
	hs2.add(10);
	hs2.add(20);
	hs2.add(25);
	hs2.add(30);
	
	System.out.println(hs2);
	
	for (Integer n : hs2) {
		System.out.println(n);
		}
	
	Iterator<Integer> itr = hs2.iterator();
	while(itr.hasNext()) {
		Integer num = itr.next();
		System.out.println(num);
	}
	
	System.out.println(hs2);
	
	Spliterator<Integer> sitr = hs2.spliterator();
	while(itr.hasNext()) {
		Integer n1 = itr.next();
		System.out.println(n1);
	}
	
	Object[] arr = hs2.toArray();
    for(int j=0;j<arr.length;j++) {
    	System.out.println(arr[j]);
    }
    
  
	
    
    
	}

}
