package com.java;

import java.util.Scanner;

public class factorialofno {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer number");
	int num1=sc.nextInt();
	int fact=1;

	for(int i=1;i<=num1;i++) {
		fact*=i;
		
	}
	System.out.println("factorial of a given number is "+fact);
	
	


}
}
