
//WAP to input a string and reverse it without using any inbuilt method
package com.pack;

import java.util.Scanner;

public class ReverseString {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String k="";
	int l=s.length()-1;
	for(int i=0;i<s.length();i++)
	{ k=k+s.charAt(l);
		
		l--;
	}
	
	for(int i=0;i<s.length();i++)
	{ 
		System.out.print(k.charAt(i));
		
	}
}
}
