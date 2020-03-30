package org.test;

public class CompoundInterst {
	public  void calculate(int p, int n, int t ,double r) {
		 double a=p*Math.pow(1+r/n, n*t);
		double I=a-p;
		System.out.println("The amount is "+a);
		System.out.println("The Intrest is "+I);
	}
public static void main(String[] args) {

	CompoundInterst ci= new CompoundInterst();
	ci.calculate(200, 12, 5, 0.8);
	
}
}
