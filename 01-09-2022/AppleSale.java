
/*5. Write a program to accept value of apple sales for each day of the week (using array of
type float) and then, calculate the average sale of the week.
*/
package com.java;

import java.util.Scanner;

public class AppleSale {

	public static void main(String args[])
	{
		float a[]=new float[7];
		float avg=0;
		
		Scanner sc= new Scanner (System.in);
		for (int i=0;i<7;i++)
		{
			System.out.println("Enter the sale of apple on day "+(i+1)+":");
			
			float pr=sc.nextFloat();
			
			a[i]=pr;
			
		}
		
		for(int i=0;i<7;i++)
		{
			avg=avg+a[i];
		}
		avg=avg/7;
		
		System.out.println("\nAverage sale of the week:"+avg);
	}
}
