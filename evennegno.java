package com.java;

public class evennegno {
public static void main(String args[]) {
int a=2;
if(a%2==0)
{
	if(a<0) {
		System.out.println(a+" is even as well as negative number");
	}
	else
		System.out.println(a+" is  even but not a negative number");
}
else 
{	if(a<0) {
	System.out.println(a+" is not even but it is a negative number");
}
else
	System.out.println(a+" is  neither even but nor negative number");
	
}
}
}