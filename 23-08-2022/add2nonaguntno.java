/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. 
(Do not use Java built-in method)Write a do-while loop that asks the user to enter two numbers. The numbers should be added and
the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should 
repeat; otherwise it should terminate.*/


package com.java;

import java.util.Scanner;

public class add2nonaguntno {
	 public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
		

		int sum=0,yn=1;
		do { 
			
		
			sum=0;
			System.out.println("enter two number to do addition");
		int n=sc.nextInt();
		int n2=sc.nextInt();
			sum+=n+n2;
			System.out.println("sum is "+sum);
			System.out.println("enter 1  to perform operation again else enter 0  to stop");
			yn=sc.nextInt();
			
			
		
		}while(yn!=0);
	    }
}
