package org.test;

public class CallbyValue {

	public static void main(String[] args) {
      int a=10;
      int b=20;
      CallbyValue ob=new CallbyValue();
      ob.add(a, b);
	}
public void add(int x, int y) {
	int z=x+y;
	System.out.println(z);
}
}
