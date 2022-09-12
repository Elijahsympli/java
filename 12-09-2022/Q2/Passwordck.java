/*
Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.

*/
package com.pack;

import java.util.Scanner;



public class Passwordck {
	
	
	public static void main(String args[]) throws IncorrectPasswordException {
		Scanner sc= new Scanner(System.in);
String passwrd="john123";
System.out.print("Enter your password:");
String pswd=sc.next();
	try {
		if (passwrd.equals(pswd)) {
			System.out.println("WELCOME");
		}else {
			throw new IncorrectPasswordException("Incorrect password ");
		}
		
	} catch (IncorrectPasswordException e) {
		System.out.println(e.getMessage());
	}
}
}
