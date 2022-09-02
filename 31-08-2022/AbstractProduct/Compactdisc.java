package com.java;

public class Compactdisc extends Product {
	
	String Product_id,Artist,Title;
Compactdisc(String pid, double price,String artist,String title) {
		super(pid, price);
		this.Product_id=pid;
		this.Artist=artist;
		this.Title=title;
	}

void diaplay() {
	System.out.println("Produc Id:"+this.Product_id+"  Artist:"+this.Artist+"  Title:"+this.Title);
}

}
