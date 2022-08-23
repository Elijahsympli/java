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
