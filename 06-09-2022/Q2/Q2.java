/*
Write a program to raise a user defined exception if username is less than 6
characters and password does not match.
*/
package com.java;

import java.util.Scanner;

public class Q2 {
	static void validate() throws PasswordNotMatchException,LessCharactersException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String ch=sc.nextLine();
		
		
		
		if(ch.length()<=6) {
			throw new LessCharactersException("Username should not be less than 6 characters");
			
		}
		
		else
		{
			System.out.println("Enter your password:");
			String ck=sc.nextLine();
			System.out.println("Enter your password to confirm:");
			String cf=sc.nextLine();
			if(!(ck.equals(cf))) {
				throw new PasswordNotMatchException(" Password Not Match");
				
			}
			else {
				System.out.println(" \nWELCOME");
			}
			
			
		
		
		}
			}


	

			public static void main(String args[]) throws PasswordNotMatchException,LessCharactersException
			{
				
				try {
					Q2.validate();
				} catch (PasswordNotMatchException e) {
					System.out.println(e.getMessage());
				}
				catch (LessCharactersException e) {
					System.out.println(e.getMessage());
				}
				
				
			}
}
