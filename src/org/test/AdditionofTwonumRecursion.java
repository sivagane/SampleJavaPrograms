package org.test;

public class AdditionofTwonumRecursion {
public static void main(String[] args) {
	int number=3;
	int sum= addnumber(number);
	System.out.println("The Addition natural numbers upto "+number+ " is " +sum);
}
public static int addnumber(int num) {
	if(num!=0) {
	return num+addnumber(num - 1);
}
	else {
		return num;
	}
}
}

