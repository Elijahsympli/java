//2. Write a java program to print the table of all the numbers from 1 to 10
//What will be the output of the following program?

package com.java;

import java.util.Scanner;

public class multtable1to10 {
	public static void main(String args[]) {
	
	int mult=0;
	System.out.println("multiplication table 1 to 10 are:");
	for(int j=1;j<=10;j++) {
	for(int i=1;i<=10;i++) {
		mult=j*i;
		System.out.println(j+"x"+i+"="+mult);
	}
	
	System.out.println();
	
	}

}
}
