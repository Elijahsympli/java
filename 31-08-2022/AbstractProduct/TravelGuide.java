package com.java;

public class TravelGuide extends Book {
String Product_id,Country;
TravelGuide(String pid,double p,String i,String a,String t,String c){
	
	super(pid,p,i,a,t);
	super.display();
	this.Product_id=pid;
	this.Country=c;
}
void display() {
	System.out.println("Product Id:"+this.Product_id+"  Country:"+this.Country);
}
}
