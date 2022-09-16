/*
Write a Java Program to Delete All Repeated Words in String
*/
package com.pack;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		int k=0,j=0;
		
		String st="hi hello hi world hi ho hi ti";
		System.out.println(st+"\nEnter a word present above");
		Scanner sc=new Scanner(System.in);
		
		String kl="";
		String[] n=new String[8];
		//String[] n=st.split(" ");
		for(int i=0;i<st.length();i++) {
			
			if(st.charAt(i)==' ') {	
			
				n[j]=kl;
				kl="";
				j++;
			
			}
			else {
				kl+=st.charAt(i);
				
				n[j]=kl;
			}
		}
	
		for (int i=0;i<n.length;i++) {
			for (int j1=i+1;j1<n.length;j1++) {	
					
		if(n[i].equals(n[j1])) {
	
		n[j1]="";
			
		}
	
	
	    }
		}
		for (int i=0;i<n.length;i++) {
			if(n[i]!=null && n[i]!="") {
				System.out.println(n[i]);
			}
			
		}
	}
		
	}
	

