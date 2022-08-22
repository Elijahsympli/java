package com.java;

import java.util.Scanner;
public class nnaturalnoandsum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();	
		int sum=0;
		for(int i=0;i<=num;i++) {
			System.out.println(i);
			sum+=i;
			
		}
		System.out.println("Sum of "+num+" natural number is "+sum);
	}

}
