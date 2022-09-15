/*
 Write a Java Program to Search a Particular Word in a String.without any method 
*/
package com.pack;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		int k=0,j=0;
		
		String st="hi hello world";
		System.out.println(st+"\nEnter a word present above");
		Scanner sc=new Scanner(System.in);
		String op=sc.next();
		String kl="";
		String[] n=new String[st.length()];
		//String[] n=st.split(" ");
		for(int i=0;i<st.length();i++) {
			
			if(st.charAt(i)==' ') {	
			
				n[j]=kl;
				kl="";
				j++;
			
			}
			else
				kl+=st.charAt(i);
				n[j]=kl;
			
		}
	
		for (int i=0;i<n.length;i++) {
		
		if(op.equals(n[i])) {
			k=0;
		
			break;
		}
		else 
			k=1;
	}
		if (k==0) {
			System.out.println("the Entered word is present in a string");
		}
		else
			System.out.println("The Entered word is not present in a string");
	}

}
