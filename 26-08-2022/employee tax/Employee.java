package com.java;

public class Employee {
String Pan_no,name;
double ATI;
double tax(String pan,String name,double ati) {
	this.Pan_no=pan;
	this.name=name;
	this.ATI=ati;
	
	if(ATI<=100000) {
	System.out.println("No tax");
	return 0.0;
	}else if(ATI>=100001 && ATI<=150000){
		return 0.1*ATI;
	}
	else if(ATI>=150001 && ATI<=250000) {
		return 5000+0.2*ATI;
	}else
		
	return 25000+0.3*ATI;
}
}
