/*
Write a Java Program to take marks of a student and then print his/her grade depending on the following conditions:
90 to 100 then grade is A+, 
80 to 90  then grade is A
70 to 80 then grade is B+
60 to 70 then grade is B
50 to 60 then grade is C
40 to 50 then grade is D
30 to 40 then grade is E
less than 30 then grade is F
*/


package com.java;

public class stmarksgrade {
	public static void main(String args[]) {
		
		String st="carl's";
		int stm=7;
		if(stm>90 && stm<100) {
			System.out.println(st+" grade is A+");
			
		}
		else if(stm>80 && stm<90) {
			System.out.println(st+" grade is A");
		}
		else if(stm>70 && stm<80) {
			System.out.println(st+" grade is B+");
		}
		else if(stm>60 && stm<70) {
			System.out.println(st+" grade is B");
		}
		else if(stm>50 && stm<60) {
			System.out.println(st+" grade is C");
		}
		
		else if(stm>40 && stm<50) {
			System.out.println(st+" grade is D");
		}
		else if(stm>30 && stm<40) {
			System.out.println(st+" grade is E");
		}
		else {
			System.out.println(st+" grade is F");
		}
		
		
		
	}

}
