package org.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
public static void main(String[] args) {
	ArrayList<Integer> li= new ArrayList<>();
    li.add(10);
    li.add(20);
    li.add(30);
    li.add(40);
    li.add(50);
    
 ListIterator<Integer> itr=li.listIterator();
 System.out.println("The Forward Iteration is :");
    while(itr.hasNext()) {
    	System.out.println( +itr.next());
    }
    System.out.println("The Backward Iteration is :");
    while(itr.hasPrevious()) {
    	System.out.println(+itr.previous());;
    }
}
}
