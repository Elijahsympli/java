//Write a program in Java to display the cube of the number upto given an integer.
package com.java;

import java.util.Scanner;

public class inpandcubenno {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer number");
	int num1=sc.nextInt();
	int cubeofno=0;

	for(int i=1;i<=num1;i++) {
		cubeofno=i*i*i;
		System.out.println("cube of "+i+"="+cubeofno);
	}
	
	
	


}

}
