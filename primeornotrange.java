package com.java;
import java.util.Scanner;
public class primeornotrange {


	

	
		public static void main(String args[]) {
			/*Scanner sc=new Scanner(System.in);
			System.out.println("enter ranges of  integer number");
			int n=sc.nextInt();
			int num2=sc.nextInt();*/
			int n=15,num2=30;
			for(int j=n;j<=num2;j++) {
				int k=0;
				int l=j;
			for(int i=1;i<=j;i++) {
				if(l%i==0) {
					k+=1;
				}
			
			
			}
		if(k==2) {
			System.out.println(l+" is  a prime number");
			}
			
			
			}

		}
	}


