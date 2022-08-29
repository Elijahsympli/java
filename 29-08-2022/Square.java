package com.java;

public class Square extends Shape {
	Square(int d)
	{
		this.side=d;
	}
	void SquareArea() {
		System.out.println(side*side);
	}

}
