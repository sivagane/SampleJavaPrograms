package org.test;

public class CallbyReference {
    int a;
    int b;
	public static void main(String[] args) {
    CallbyReference ob=new CallbyReference();
    ob.a=20;
    ob.b=40;
    ob.swap(ob);
	}
    public void swap(CallbyReference h) {
    	int temp=h.a;
    	h.a=h.b;
    	h.b=temp;
    	System.out.println("After Swapping");
    	System.out.println(h.a);
    	System.out.println(h.b);
    }
}
