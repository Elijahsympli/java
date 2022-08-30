/*Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize 
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
class with its constructor having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a sq
square*/
package com.java;

import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
	System.out.println("enter the breath");
	int n1=sc.nextInt();
	System.out.println("enter the side");
	int sq=sc.nextInt();
	Square s=new Square(sq,n, n1);
	s.SqArea();
	s.SqPerimeter();
	
}
}

