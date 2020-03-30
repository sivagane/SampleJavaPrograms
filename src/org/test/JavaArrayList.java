package org.test;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList {
public static void main(String[] args) {
	ArrayList<Double>ar=new ArrayList<Double>();
	
	ar.add(20.33);
	ar.add(10.22);
	ar.add(30.33);
	ar.add(40.45);
	
	for (Double dec : ar) {
		System.out.println(dec);
	}
	
	Iterator<Double> itr = ar.iterator();
	while(itr.hasNext()) {
		Double dec1 = itr.next();
		System.out.println(dec1);
	}
	
  for(int i=0;i<ar.size();i++) {
	  System.out.println(ar.get(i));
  }
  
  int num=0;
  while(ar.size()>num) {
	  System.out.println(ar.get(num));
	  num++;
  }
}
}
