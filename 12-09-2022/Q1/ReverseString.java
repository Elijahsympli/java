
//WAP to input a string and reverse it without using any inbuilt method
package com.pack;

public class ReverseString {
public static void main(String args[]) {
	
	String s="home",k="";
	int l=s.length()-1;
	for(int i=0;i<s.length();i++)
	{ k=k+s.charAt(l);
		System.out.print(s.charAt(i));
		l--;
	}
	System.out.println();
	for(int i=0;i<s.length();i++)
	{ 
		System.out.print(k.charAt(i));
		
	}
}
}
