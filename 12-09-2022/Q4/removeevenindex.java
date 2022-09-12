/*
 write a java program to remove the characters at even indexes and then print the new string
 without using any method for removing 
*/
package com.pack;

import java.util.Scanner;

public class removeevenindex {
public static void main(String args[]) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character present in  the given string to remove it  ");
	String s=sc.next();
	String k="";
	
	for(int i=0;i<s.length();i++)
	{ 
		if(i==0 || i%2==0) {
		
	}else
		{
		System.out.print(s.charAt(i));

		}
	
	}
	
	
}
}
