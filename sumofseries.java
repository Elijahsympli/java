package com.java;

import java.util.Scanner;

public class sumofseries {
	 public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		float sum=0;
		for(double i=1;i<=n;i++) {
		sum+=1/i;
		}
	        System.out.println(sum);
	    }
}
