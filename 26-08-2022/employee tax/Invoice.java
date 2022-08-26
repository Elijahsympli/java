package com.java;

public class Invoice {
	String PNo,PDcpt;
	int Quantity;
	double Price;
	Invoice(String PNo,String PDcpt,int Quantity,double Price){
		this.PNo=PNo;
		this.PDcpt=PDcpt;
		this.Quantity=Quantity;
		this.Price=Price;
	}
	double getInvoice() {
		if(Quantity<0 || Price<0) 
			return 0;
			else
		
		return Quantity*Price;
		
	}
}
