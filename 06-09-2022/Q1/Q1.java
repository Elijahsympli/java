
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

/*
 class App
{
	
	void check() throws IncorrectException
	{
		String ques[]= {"what is java?","which is the largest river"};
		String option1[]= {"object oriented language","nile river"};
		String option2[]= {"procedural oriented language","sfsfg"};
		for(int i=0;i<ques.length;i++)
		{
			String q=ques[i];
			System.out.println(q);
			System.out.println(option1[i]);
			System.out.println(option2[i]);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			String ch=sc.n
nextLine();
if(!(ch.equals(option1[i]))) {
				throw new IncorrectException("Wrong answer");
			}else {
				System.out.println("Correct");
			}
		}
Dharna10:55
public static void main(String args[])
	{
		App a=new App();
		try {
			a.check();
		} catch (IncorrectException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
*/
