/*Create a class called Shape which has a property side.
Create a subclass of Shape called Square which should use the property of 
Shape class to display area of square
Note: Take input
*/
package com.java;

import java.util.Scanner;

public class Main {public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an integer number");
	int num1=sc.nextInt();
	
	Square m=new Square(num1);
	m.SquareArea();
}

}
