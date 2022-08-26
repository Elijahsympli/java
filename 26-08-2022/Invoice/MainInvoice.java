
/*Create a class called Invoice that a hardware store might use to represent an invoice
  for an item sold at the store.An Invoice should include four pieces of information as 
  instance variables‐a part number(type String),a part
description(type String),a quantity of the item being purchased (type int) and a price per item  (double). 
Your class should have a constructor that initializes the four instance variables.
 In addition, provide a method named getInvoice Amount that calculates the invoice amount 
 (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.
*/
package com.java;

import java.util.Scanner;

public class MainInvoice {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a part number");
		String Pno=sc.nextLine();
		System.out.println("enter a part description");
		String Pd=sc.nextLine();
		System.out.println("enter the quantity of the item ");
		int qnt=sc.nextInt();
		System.out.println("enter a price ");
		double p=sc.nextDouble();
		
	Invoice sh=new Invoice(Pno,Pd,qnt,p);
	
	System.out.println(sh.getInvoice());
}
}
