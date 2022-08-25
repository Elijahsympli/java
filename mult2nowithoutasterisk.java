//Write a Java program to multiply two given integers without using the multiply operator(*).
package com.java;

import java.util.Scanner;

public class mult2nowithoutasterisk {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int mult=0;

	System.out.println("enter two integer number to multiply");
	
	int n=sc.nextInt();
	int n2=sc.nextInt();
	for (int i=1;i<=n2;i++) {
		mult+=n;
	}
	System.out.println(n+"*"+n2+"="+mult);
	
}
}
