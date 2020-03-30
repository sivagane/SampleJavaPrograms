package org.test;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedArrayList {

	public static <E, T> void main(String[] args) {
    ArrayList<T> li=new ArrayList<T>();
    li.add((T) "India");
    li.add((T) "is a");
    li.add((T) "Secular");
    li.add((T) "Country");
    li.add(12345, (T) int);
    
    for(int i=0;i<li.size();i++) {
    	System.out.println(li.get(i));
    }
    
    ArrayList<Integer> li1=new ArrayList<Integer>();
    li1.add(10);
    li1.add(20);
    li1.add(30);
    
    for(int i=0;i<li1.size();i++) {
    	System.out.println(li1.get(i));
    }
    ArrayList<E>li2=new ArrayList<E>();
    Employee e1=new Employee("Siva",27,"8/9/1990", 50000.23);
    Employee e2=new Employee("Ganesh", 27,"2/2/2020", 25000.23);
    
    ArrayList<Employee>li3=new ArrayList<Employee>();
    li3.add(e1);
    li3.add(e2);
    
    Iterator<Employee> itr = li3.iterator();
    while(itr.hasNext()) {
    	Employee emp = itr.next();
    	System.out.println(emp.name);
    	System.out.println(emp.age);
    }
    
    
	}

}
