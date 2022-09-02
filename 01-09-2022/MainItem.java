/*4. Write a program to define a class Item containing code and price. Accept this data for five objects 
  using array of objects. Display code, price in tabular form and also, display total price of all items.
 */
package com.java;

import java.util.Scanner;

public class MainItem {

		public static void main(String args[])
		{
			Item[] it=new Item[5];
			
			String cd;
			float pr,total_cost=0;
			
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the code:");
				cd=sc.next();
				
				System.out.println("Enter the price:");
				
				pr=sc.nextFloat();
				
				it[i]=new Item(cd,pr);
			}
			
			System.out.println();
			 System.out.println("Item Code Item Price");
			for(int i=0;i<5;i++)
			{
				System.out.print("     "+it[i].Code);
				System.out.println("         "+it[i].price);
				
				total_cost=total_cost+it[i].price;
			}
			System.out.println("Total Price="+total_cost);
		}
}
