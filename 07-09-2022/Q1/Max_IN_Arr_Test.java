
//Create a junit test case for finding the maximum value in an array
package com.Junit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max_IN_Arr_Test {

	@Test
	void test() {
		MaxVinARR a=new MaxVinARR();
		int actual=a.Max();
		int expected=67;
		assertEquals(expected,actual);
	}

}
