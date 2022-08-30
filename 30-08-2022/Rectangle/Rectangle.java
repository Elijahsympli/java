

package com.java;

public class Rectangle {
	int length,breadth;
	Rectangle(int sq,int l,int b){
		this.length=l;
		this.breadth=b;
		
	}
	void Area(){
		System.out.println("Area of Rectangle="+length*breadth);
	}
	void Perimeter() {
		System.out.println("perimeter of Rectangle="+2*(length+breadth));
	}
	

}
