
//2. WAP to input an array having 3 rows and 3 columns of type String.
package com.java;

import java.util.Scanner;

public class Inpstr3x3Arr {
	public static void main(String args[]) {
		
		String a[][]=new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
		{Scanner sc=new Scanner(System.in);
		String str=sc.next();
		a[i][j]=str;
		}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
		
				System.out.println("a["+i+"]["+j+"]="+a[i][j]);
		}
		}
		}

