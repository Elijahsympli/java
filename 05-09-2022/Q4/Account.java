package com.java;

import java.util.Scanner;

public class Account {
	double deposit(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter amount to deposit into your account");
		double da=sc.nextDouble();
		return da;
}
}