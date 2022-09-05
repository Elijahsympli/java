/*
Write a Java Program to Create Account with 500 Rs Minimum Balance
Create  a Class Called LessBalanceException Which returns
the Statement that Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is more than the
balance.
*/
package com.java;

import java.util.Scanner;

public class Q4 {
	static void validate(double d) throws LessBalanceException{
Scanner sc= new Scanner(System.in);
	System.out.println("Balance:"+d);
		System.out.println("Enter Amount to withdraw");
		
		double amt=sc.nextDouble();
		if(amt>d) {
			throw new LessBalanceException("WithDraw Amount "+amt+" is Not Valid ");
			
		}
		
		else
		{
			System.out.println("Withdraw Successfully");
			System.out.println("Balance:"+(d-amt));
			
		}
			}

			public static void main(String args[]) throws LessBalanceException
			{System.out.println("balance:500");
				Account ac =new Account();
				try {
					Q4.validate(ac.deposit()+500);
				} catch (LessBalanceException e) {
					System.out.println(e.getMessage());
				}
				
				
			}
}
