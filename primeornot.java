package com.java;

import java.util.Scanner;

public class primeornot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer number");
		int num1=sc.nextInt();
		int k=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				k+=1;
			}
		
		}
		if(k==2) {
		System.out.println("it is  a prime number");
		}
		else
		{
			System.out.println("it is not a  prime number");
	
		}
		


	}
}
