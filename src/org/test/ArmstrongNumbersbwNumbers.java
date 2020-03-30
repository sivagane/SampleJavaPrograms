package org.test;

import java.util.Scanner;

public class ArmstrongNumbersbwNumbers {
public static void main(String[] args) {
	int start,end,rem,temp,i,num,count=0;
	Scanner s= new Scanner (System.in);
	System.out.println("Enter the first Number : ");
	start= s.nextInt();
	System.out.println("Enter the Second Number : ");
	end = s.nextInt();
	s.close();
	for(i=start+1;i<end;i++) {
		temp=i;
		num=0;
		while(temp!=0) {
			rem=temp%10;
			num=num+rem*rem*rem;
			temp=temp/10;
		}
		if(i==num) {
			if(count==0) {
				System.out.print("The Armstrong Number between "+start+" and "+end+" is : " );
			}
			System.out.println(i + "  ");
			count++;
		}
	}
	if(count==0)
		 {
			System.out.println("There is no Armstrong number between "+start+" and "+end);
		}
	}
}

