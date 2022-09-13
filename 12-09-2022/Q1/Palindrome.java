/*
WAP to input a string and check whether it is
 palindrome or not
*/
package com.pack;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check whether it is palindrome or not ");
		String s=sc.next();
		String k="";
		int l=s.length()-1;
		for(int i=0;i<s.length();i++)
		{ k+=s.charAt(l);
			
			l--;
		}
		if(k.equals(s))
		
			System.out.println(s+" is  a palindrome");
		else 
			System.out.println(s+" is not a palindrome");
		
}
}
