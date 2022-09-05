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
		System.out.println("Enter Amount to withdraw");
		Scanner sc= new Scanner(System.in);
		double amt=sc.nextDouble();
		if(amt>500) {
			throw new LessBalanceException("WithDraw Amount "+amt+" is Not Valid ");
			
		}
		
		else
		{
			System.out.println("Withdraw Successfully");
			System.out.println("Balance:"+(500-amt));
			
		}
			}

			public static void main(String args[]) throws LessBalanceException
			{System.out.println("Balance:500");
				
				try {
					Q4.validate();
				} catch (LessBalanceException e) {
					System.out.println(e.getMessage());
				}
				
				
			}
}
