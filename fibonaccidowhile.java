package com.java;

import java.util.Scanner;

public class fibonaccidowhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer number");
		int num1=sc.nextInt();
		int i=2,a=0,b=1,c;
		System.out.println("Fibonacci series");
		System.out.print(a+" "+b+" ");
		do {
			
			
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
			i++;
		}
			
		while(i<=num1);
	
		
		


	}
}
