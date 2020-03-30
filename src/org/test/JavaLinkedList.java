package org.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaLinkedList {

	public static <E> void main(String[] args) {
      LinkedList<String>ll=new LinkedList<String>();
      ll.add("Siva");
      ll.add("Ganesh");
      ll.add("Java");
      ll.add("Selenium");
      ll.add("Framework");
      
      LinkedList<String>ll3=new LinkedList<String>();
      
      ll3.addAll(ll);
      System.out.println(ll3);
      
      Iterator<String> ditr = ll3.descendingIterator();
      while(ditr.hasNext()) {
    	  String s = ditr.next();
    	  System.out.println(s);
      }
      
      for(int i=0;i<ll3.size();i++) {
    	  System.out.println(ll3.get(i));
      }
      
      for (String s : ll3) {
		System.out.println(s);
	}
      
      
      
      boolean b = ll3.equals(ll);
      System.out.println(b);
      
      ListIterator<String> LIll3 = ll3.listIterator();
      while(LIll3.hasNext()) {
    	  String st = LIll3.next();
    	  System.out.println(st);
      }
      
      int LastIndexof = ll3.lastIndexOf("Java");
      System.out.println(LastIndexof);
      
      System.out.println(ll);
      
      ll.addFirst("Writing");
      ll.addLast("Reading");
      
      System.out.println(ll);
      ll.removeLast();
      System.out.println(ll);
      
      ll.removeFirst();
      System.out.println(ll);
      
      LinkedList<E> ll1=new LinkedList<E>();
      Employee e4=new Employee("siva",30,"8/9/1990",30000.34);
      Employee e5=new Employee("Ganesh",29,"8/9/1990",20000.23);
      Employee e6=new Employee("Java", 25,"0/0/0000", 0000.00);
      
      
      LinkedList<Employee> ll2=new LinkedList<Employee>();
      ll2.add(e4);
      ll2.add(e5);
      ll2.add(e6);
      
      for (Employee e : ll2) {
    	  System.out.println(e.name);
    	  System.out.println(e.DOB);
    	  System.out.println(e.Salary);
    	  System.out.println(e.age);
		
	}
      
      
	}

}
