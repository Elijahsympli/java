/*
 Write a program to print the roll number and average marks of 8 students in three subjects 
 (each out of 100). The marks are entered by user.
 */

package com.java;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		float avg=0;
		int a[]=new int[8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++) {
	
	System.out.println("Enter the marks of the "+(i+1)+"st student: ");
	a[i]=sc.nextInt();
	avg=avg+a[i];
	

}
		for(int i=0;i<8;i++) {
			
			System.out.println("Rollno:"+(i+1)+"   Marks:"+a[i]);
			
		}
	
		System.out.println("Average marks of 8 student:"+avg/8);
		}
		}
