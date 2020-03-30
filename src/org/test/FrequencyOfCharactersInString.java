package org.test;

public class FrequencyOfCharactersInString {
public static void main(String[] args) {
	int i,j;
	String str="great responsibility";
	char []Strin=str.toCharArray();
	int[] freq=new int[Strin.length];
	
	System.out.println("The Characters and their corresponding frequencies");
	for(i=0;i<str.length();i++) {
		freq[i]=1;
		for(j=i+1;j<str.length();j++) {
			if(Strin[i]==Strin[j]&&Strin[i]!=' ') {
				freq[i]++;
                Strin[j]='0';
			}
			}
	}
   for(i=0;i<freq.length;i++) {
	if(Strin[i]!=' '&&Strin[i]!='0') {
		System.out.println(Strin[i]+ "-"+freq[i]);
	}
}
}
}
