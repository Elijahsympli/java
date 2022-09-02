/*Write a java program to input 5 elements of an array and search for a number whether it is
   present in an array or not. If present print its position in the array
 */

package com.java;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
	int a[]=new int[5];
	int k=0;
	System.out.println("Enter 5 element of an array:");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		
	int el=sc.nextInt();
	a[i]=el;
	}
	System.out.println("Enter a number to search it is present an array or not:");
	int search=sc.nextInt();

	for(int i=0;i<5;i++)
	{
			if(a[i]==search) {
				
				k=k+1;
			}	
	
	}
if (k==0) {
	System.out.println("the entered number is not present in an array");
}
else {
	System.out.println("the number entered  present in an array are:");
	for(int i=0;i<5;i++)
	{
			if(a[i]==search) {
				
				System.out.println("a["+i+"]="+search);
			}	
	
	}
}
}
}
