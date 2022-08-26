//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
package com.java;

import java.util.Scanner;

public class onenotopowofanono {
	 public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int n1=sc.nextInt();
			int n2=sc.nextInt();
			int pow=1;
			for(int i=n1;i==n1;i++) {
				for(int j=1;j<=n2;j++) {
					pow*=i;
				}
			}
	        System.out.println(n1+" to the power of "+n2+" is "+pow);
	    }
}
