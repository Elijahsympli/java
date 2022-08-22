package com.java;

import java.util.Scanner;

public class switchmaxno {
	public static void main(String args[])
	{
		
		int k;
		
int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		a=sc.nextInt();
		System.out.println("Enter the second value");
		b=sc.nextInt();
		if(a>b)
			k=1;
		else
			k=b;
		switch(k) {
		
		case 1:
			System.out.println(a+" is maximum");
			break;
		
		default:
			System.out.println(b+" is maximum");
			break;
			
			
		
		}
		
	}

}
