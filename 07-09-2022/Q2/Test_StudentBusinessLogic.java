/*
Create a class having student details like name,marks in 3 subjects and a percentage variable
create a student business logic which should return the percentage of three subjects
and then test the business logic using junit
*/

package com.Junit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_StudentBusinessLogic {

	
	StudentDetails e=new StudentDetails();
	StudentBusinessLogic eg=new StudentBusinessLogic();
	@Test
	void testst()
	{   e.setMaxmarks(300);
	    e.setName("carl");
	   
		e.setMarks1(45);
		e.setMarks2(60);
		e.setMarks3(80);
		double per=eg.percentage(e);
		assertEquals(61.0,per);
	}
}
