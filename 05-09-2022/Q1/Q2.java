/*
Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user passed through the command line is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
 If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.
*/
package com.java;

import java.util.Scanner;

public class Q2 {
	static void validate() throws TooColdException,TooHotException{
		Scanner sc= new Scanner(System.in);
		double temp=sc.nextDouble();
		if(temp>35) {
			throw new TooHotException("TOO HOT ");
			
		}
		else if(temp<5) {
			throw new TooColdException("TOO COLD");

		}
		else
		{
			System.out.println("Normal");
			
		
			double F = temp*(9/5)+32;
			System.out.println("In fahrenheit:"+F);
		}
			}




			public static void main(String args[]) throws TooColdException,TooHotException
			{
				
				try {
					Q2.validate();
				} catch (TooHotException e) {
					System.out.println(e.getMessage());
				}
				catch (TooColdException e) {
					System.out.println(e.getMessage());
				}
				
			}
}
