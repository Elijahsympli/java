package com.java;

import java.util.Scanner;

public class inpoperatorandperf {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two integer number");
	int num=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("enter operator to perform arithmetic operation");
	 char c = sc.next().charAt(0);
	switch(c) {
	
	case '*':
		System.out.println(num*num2);
		break;
	case '+':
		System.out.println(num+num2);
		break;
	case '-':
		System.out.println(num-num2);
		break;
	case '/':
		System.out.println(num/num2);
		break;
	case '%':
		System.out.println(num%num2);
		break;
	default:
		System.out.println("invalid ");
	
		
	}
	
}

	


}

