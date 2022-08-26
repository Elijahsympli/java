//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
package com.java;

import java.util.Scanner;

public class GCDof2no {
	 public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int n1=sc.nextInt();
			int n2=sc.nextInt();
			int k=0;
		 for(int i=1;i<n1 || i<=n2;i++)
		 {
			
	      if(n1%i==0 && n2%i==0) {
	    	  k=i;
	      }
		 }
	        System.out.println(k +" is the greatess common divisor");
	    }
}
