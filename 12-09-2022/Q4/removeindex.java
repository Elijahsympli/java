/*
 write a java program to remove the characters at even indexes and then print the new string
 without using any method for removing 
*/
package com.pack;

import java.util.Scanner;

public class removeindex {
public static void main(String args[]) {
	
	String str="hello";
	System.out.println(str);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character present in  the given string to remove it  ");
	char s=sc.next().charAt(0);
	String k="";
	
	for(int i=0;i<str.length();i++)
	{ 
		if(s==str.charAt(i)) {
		
	}else
		{
		System.out.print(str.charAt(i));

		}
	
	}
	
	
}
}
