package com.java;
import java.util.Scanner;
public class inp5intsumavg {
	
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 5 integer numbers");
			int num1=sc.nextInt();	
			int num2=sc.nextInt();	
			int num3=sc.nextInt();	
			int num4=sc.nextInt();	
			int num5=sc.nextInt();	
			int sum=0;
			sum=num1+num2+num3+num4+num5;
			int avg=sum/5;
			System.out.println("sum of 5 integer numbers="+sum);
			System.out.println("average of 5 integer numbers="+avg);
		

	}
}
