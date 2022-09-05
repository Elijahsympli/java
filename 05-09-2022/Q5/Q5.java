/*
Consider a Quiz Management System, where a user needs to answer 5 questions. 

If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”.
*/
package com.java;

import java.util.Scanner;

public class Q5 {
	static void validate() throws NotCorrectException {
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			if(i==0) {
				System.out.println("Q1.Age to be able to vote");
				System.out.println("1). 18\n2).10");
				System.out.print("Enter your answer:");
				int an=sc.nextInt();
				if(an==1) {
					System.out.println("good! The answer is correct");
				}
				else if (an==2) {
					throw new NotCorrectException ("Not Correct");
					
				}
			}
			
			if(i==1) {
				System.out.println("Q2.There are two apple if you eat one apple how many left.");
				System.out.println("1). 1\n2).2");
				System.out.print("Enter your answer:");
				int an=sc.nextInt();
				if(an==1) {
					System.out.println("good! The answer is correct");
				}
				else if (an==2) {
					throw new NotCorrectException ("Not Correct");
				}
			}
			if(i==2) {
				System.out.println("Q3.9x9=");
				System.out.println("1). 81\n2).91");
				System.out.print("Enter your answer:");
				int an=sc.nextInt();
				if(an==1) {
					System.out.println("good! The answer is correct");
				}
				else if (an==2) {
					throw new NotCorrectException ("Not Correct");
				}
			}
			if(i==3) {
				System.out.println("Q4.5+5");
				System.out.println("1). 5\n2).10");
				System.out.print("Enter your answer:");
				int an=sc.nextInt();
				if(an==1) {
					throw new NotCorrectException ("Not Correct");
				}
				else if (an==2) {
					System.out.println("good! The answer is correct");
				}
			}
			if(i==4) {
				System.out.println("Q5.5 divide by 5");
				System.out.println("1). 1\n2).5");
				System.out.print("Enter your answer:");
				int an=sc.nextInt();
				if(an==1) {
					System.out.println("good! The answer is correct");
				}
				else if (an==2) {
					throw new NotCorrectException ("Not Correct");
					
				}
			}
			
			
		}
		
		
		
		
			}

			public static void main(String args[]) throws NotCorrectException
			{System.out.println("          QUIZ\n");
				
				try {
					Q5.validate();
				} catch (NotCorrectException e) {
					System.out.println(e.getMessage());
				}
				
				
			}
}
