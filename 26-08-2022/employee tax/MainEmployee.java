package com.java;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String args[]) {
	Employee sh=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your pan number");
	String pno=sc.nextLine();
	System.out.println("enter your name");
	String name=sc.nextLine();
	System.out.println("enter your annual income");
	double ati=sc.nextDouble();
	System.out.println(sh.tax(pno,name,ati));
}
}