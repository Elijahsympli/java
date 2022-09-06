package com.java;

public class Result extends Student implements Exam{

	Result(String name, int roll, int marks1, int marks2) {
		super(name, roll, marks1, marks2);
	
		this.marks1=marks1;
		this.marks2=marks2;
	}
	public void Per_display(){
		System.out.println("Percentage:"+Percent_cal()+"%");
		
	}
	@Override
	public double Percent_cal() {
		
		double m=((marks1+marks2)*100)/200;
		
		return m;
	}
	

}
