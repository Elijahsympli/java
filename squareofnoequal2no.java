package com.java;

import java.util.Scanner;

public class squareofnoequal2no {
public static void main(String args[]) {
	int sum=0;
	
	Scanner sc=new Scanner(System.in);
	

	System.out.println("enter the number");
	
	int n=sc.nextInt();
	for(int j=0;j<=n;j++) {
	for(int i=0;i<=n;i++) {
	sum=(j*j)+(i*i);
	
	
	if(n==sum) {
		System.out.println(n+" is the sum of "+i+" and "+j+" square number");
		
	}

	}
}
}
}
