package com.java;

public class Student {
String name;
int marks1,marks2,roll;
Student(String name,int roll,int marks1,int marks2){
	this.name=name;
	this.roll=roll;
	this.marks1=marks1;
	this.marks2=marks2;
}
void show() {
	System.out.println("Name:"+name+"\nRoll No:"+roll+"\nMarks1:"+marks1+"\nmarks2:"+marks2);
}
}
