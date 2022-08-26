/*
Write a Java program to solve quadratic equations and check whether the roots are positive,equal or negative (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
*/
package com.java;

public class quadraticeqa {


	public static void main(String args[])
	{
	
{
	
	int a=1,b=5,c=1;
	double d=b*b-4*a*c;
	if(d==0) {
		System.out.println("roots are equal");
	}else if(d>0) {
		System.out.println("roots are real and diferent");
	}else {
		System.out.println("roots are imaginary");
	}
}
	}
}

