//Write a Java Program to find whether a number is even or odd using conditional operator
package com.java;

public class evenoddcondi {
	public static void main(String args[]) {
		int k=3;
		int a=k%2;
		String result=a==0?" is even":" is odd";
		System.out.println(k+result);
	}

}
