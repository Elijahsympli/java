package com.java;

public class Book extends Product {
	String Product_id,isbn,author,title;
Book(String pid, double price,String isbn,String author,String title) {
		super(pid, price);
		this.product_id=pid;
		this.Price=price;
		this.isbn=isbn;
		this.author=author;
		this.title=title;
		super.show();
	}
void display() {
	System.out.println("Product Id:"+this.product_id+"  ISBN:"+this.isbn+"  author:"+author+" title:"+title);
}

}
