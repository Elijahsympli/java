//write a program to input a number and check whether it is an armstrong number or not.
	package com.java;

import java.util.Scanner;

public class armstrongwhile {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int n=num;
		int sum=0,rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(n==sum)
		System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
	}

}
