package com.java;

import java.util.Scanner;

public class MainQ3 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String nm=sc.nextLine();
		System.out.println("Enter your Roll No:");
		int ro=sc.nextInt();
		System.out.println("Enter your Marks1:");
		int m1=sc.nextInt();
		System.out.println("Enter your Marks2:");
		int m2=sc.nextInt();
		Result r=new Result(nm,ro,m1,m2);
		
		r.show();
		r.Per_display();
	}
}
