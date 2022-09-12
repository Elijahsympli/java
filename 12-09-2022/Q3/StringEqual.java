
/*
 Write a program to throw a user-defined exception "String Mismatch Exception", if
two strings are not equal (ignore the case).
 */
package com.pack;

import java.util.Scanner;

public class StringEqual {
	public static void main(String args[]) throws StringMismatchException {
		Scanner sc= new Scanner(System.in);
String str="john123";
System.out.println(str);
System.out.print("Enter the  String same as above:");
String cp=sc.next();
	try {
		if (str.equalsIgnoreCase(cp)) {
			System.out.println("the entered string is  equal to the given string");
		}else {
			throw new  StringMismatchException("the entered string is not equal to the given string");
		}
		
	} catch ( StringMismatchException e) {
		System.out.println(e.getMessage());
	}
}
}
