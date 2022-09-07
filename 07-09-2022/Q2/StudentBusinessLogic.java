/*
Create a class having student details like name,marks in 3 subjects and a percentage variable
create a student business logic which should return the percentage of three subjects
and then test the business logic using junit
*/

package com.Junit_Testing;

public class StudentBusinessLogic {
	

	public double percentage(StudentDetails sd) {
		
		
		return ((sd.getMarks1()+sd.getMarks2()+sd.getMarks3())*100)/sd.getMaxmarks();
	}

}
