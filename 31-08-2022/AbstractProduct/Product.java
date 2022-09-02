package com.java;

public class Product extends AbstractProduct {
String Product_id;
double Price;
Product(String pid,double price){
	super("a12","elene","Best");
	
	this.product_id=pid;
	this.Price=price;
	
}




void display() {
	
	System.out.println("product id:"+this.product_id+ " Price:"+this.Price);
}

}
