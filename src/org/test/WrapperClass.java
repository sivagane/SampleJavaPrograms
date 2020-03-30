package org.test;

public class WrapperClass {

	public static void main(String[] args) {
    String s="500";
    int num = Integer.parseInt(s);
    System.out.println(num);
    
    String d="14.01";
    double dec = Double.parseDouble(d);
    System.out.println(dec);
    
    String l="975036495";
    long lon = Long.parseLong(l);
    System.out.println(lon);
    
    int i=200;
    String st = String.valueOf(i);
    System.out.println(st);
    
    double d1=10.12;
    String st1 = String.valueOf(d1);
    System.out.println(st1);
    
    long l1=975036495;
    String st2 = String.valueOf(l1);
    System.out.println(st2);
	}

}
