package com.java;

public class Square extends Rectangle{
int s;
	Square(int sq,int l, int b) {
		
		super(sq,l, b);
		super.Area();
		super.Perimeter();
		
		this.s=sq;
	}
	
	void SqPerimeter() {
		System.out.println("perimeter of Square="+4*s);
	}
	void SqArea() {
		System.out.println("Area of Square="+s*s);
	}
}
