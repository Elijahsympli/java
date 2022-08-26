

/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method
named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered 
through keyboard.
*/

package assignment.java.pack;

import java.util.Scanner;



public class AreaRectangle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area add=new Area();//constructor is called here automatically
	System.out.println("enter the length and breadth");
		int p=sc.nextInt();
		int q=sc.nextInt();
		add.setDim(p, q);
		System.out.println(add.getArea());
		
		
		
		
	}

}
