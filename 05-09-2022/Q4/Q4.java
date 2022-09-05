/*
Write a Java Program to Create Account with 500 Rs Minimum Balance
Create  a Class Called LessBalanceException Which returns
the Statement that Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is more than the
balance.
*/
package com.java;

import java.util.Scanner;

public class Q4 {
	static void validate() throws LessBalanceException{
Scanner sc= new Scanner(System.in);
		System.out.println("deposite an amount");
			double da=sc.nextDouble();
		System.out.println("Enter Amount to withdraw");
		
		double amt=sc.nextDouble();
		if(amt>da) {
			throw new LessBalanceException("WithDraw Amount "+amt+" is Not Valid ");
			
		}
		
		else
		{
			System.out.println("Withdraw Successfully");
			System.out.println("Balance:"+(da-amt));
			
		}
			}

			public static void main(String args[]) throws LessBalanceException
			{
			
				try {
					Q4.validate();
				} catch (LessBalanceException e) {
					System.out.println(e.getMessage());
				}
				
				
			}
}
