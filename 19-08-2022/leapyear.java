
//Write a Java program that takes a year from user and print whether that year is a leap year or not.
package com.java;

public class leapyear {
	public static void main(String args[]) {
		int year=2016;

		
		if(year%4==0)
		{
			System.out.println(year+" is a leap year");
		}
		 else if(year%100==0)
			{
				System.out.println(year+" is a leap year");
				
			}
			else if(year%400==0)
			{
				System.out.println(year+" is a leap year");
			}
		else
		{
			System.out.println(year+" is not a leap year");
		}
	}

}
