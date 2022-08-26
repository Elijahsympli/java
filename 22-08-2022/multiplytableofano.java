//Write a program in Java to display the multiplication table of a given integer.
package com.java;

import java.util.Scanner;

public class multiplytableofano {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer number");
	int num1=sc.nextInt();
	int mult=0;
	System.out.println("multiplication of a numbers are:");
	for(int i=1;i<=10;i++) {
		mult=num1*i;
		System.out.println(num1+"x"+i+"="+mult);
	}
	
	
	


}
}
