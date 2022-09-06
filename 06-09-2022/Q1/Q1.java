
/*
Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.
*/
package com.java;

import java.util.Scanner;

public class Q1 {
	
		static void validate() throws BookNotFoundException{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter name of the book you are looking for:");
			String ch=sc.nextLine();
			String books[]= {"English","Science","Economics","Computer"};
			for(int i=0;i<books.length;i++) {
			
			if(!(ch.equals(books[i]))) {
				throw new BookNotFoundException(" Book not found");
				
			}
			
			else
			{
				System.out.println("Here is your book:"+books[i]);
				break;
			
			
			}
				}


		}

				public static void main(String args[]) throws BookNotFoundException
				{
					
					try {
						Q1.validate();
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
	}

