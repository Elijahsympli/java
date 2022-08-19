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
