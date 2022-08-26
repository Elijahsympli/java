//Write a java program to input a number and reverse it
package com.java;

import java.util.Scanner;

public class reverseano {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer number");
	int num=sc.nextInt();
	int rev=0,rem=0;

	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	


}

}
