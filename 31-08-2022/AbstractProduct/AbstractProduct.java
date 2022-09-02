package com.java;

public abstract class AbstractProduct {
String product_id,Name,Description;

 AbstractProduct(String pid,String name,String description){
	this.product_id=pid;
		this.Name=name;
		this.Description=description;	
			
}



void show() {
	System.out.println("Abstract Product Id:"+product_id+" Name:"+Name+" Description:"+Description);
	
}
}
