package com.java;

public class greatestbetween3nos {
	public static void main(String args[]) {
		int a=0,b=23,c=4;
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is greatest");
			}
			else {
				System.out.println(c+" is greatest");
			}
		}
		else if(b>a) {
			
			if(b>c) {
			System.out.println(b+" is greatest");
			}
		else {
			System.out.println(c+" is greatest");
		}
		}
		else {
			System.out.println(c+" is greatest");
		}
	}

}
