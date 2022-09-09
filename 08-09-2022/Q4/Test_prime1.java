//Create a test case for prime number which should be tested against at least 5 values using parameterised test

package com.Junit_Testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test_prime1 {
      int k=0;
	   @ParameterizedTest
	   @ValueSource(ints= {1,12,13,14,15})
		void test_array(int a) {
	
			assertTrue((a==2 || a==3 ||a==5 ||a==7) || (a!=1&&a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0));
		   }
			   
			  
	   

	
}
