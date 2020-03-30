package org.test;

public class StringCapsSmallNumberSpecial {
	public static void main(String[] args) {
		int small=0,caps=0,number=0,special=0;
	 String str="Welcome to Java Class @123";
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	if(ch>='a'&&ch<='z') 
		small++;
	else
		if(ch>='A'&&ch<='Z') 
			caps++;
		
		else
			if(ch>='1'&&ch<='9') 
            number++;
			
			else 
				special++;
}		
System.out.println("The Number of Small Letter is "+small);
System.out.println("The Number of Capital Letter is "+caps);
System.out.println("The Number of Numbers is "+number);
System.out.println("The Number of Special Character is  "+special);
}
}