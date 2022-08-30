

package com.java;

public class Rectangle {
	int length,breadth,s;
	Rectangle(int sq,int l,int b){
		this.length=l;
		this.breadth=b;
		this.s=sq;
	}
	void Area(){
		System.out.println(length*breadth);
	}
	void Perimeter() {
		System.out.println(2*(length+breadth));
	}
	void Sq() {
		System.out.println(4*s);
	}

}
