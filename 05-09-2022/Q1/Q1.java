/*
 WAP to input the salary of an employee and if the salary is not in the range of 10,000 to 20,000 
 an invalid salary exception should be thrown 
*/
package com.java;
import java.util.Scanner;


public class Q1 {
	
	static void validate() throws InvalidSalaryException{
Scanner sc= new Scanner(System.in);
double Salary1=sc.nextDouble();
if(Salary1>=10000 && Salary1 <=20000) {
		System.out.println("WELCOME");
}
else {
	throw new InvalidSalaryException("Salary should be in the range of 10,000 to 20,000 ");

}
	}




	public static void main(String args[])
	{
		
		try {
			Q1.validate();
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
}