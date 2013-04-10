package com.mashsoftware.euler.solutions;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.JUnit4;
import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
public class UtilitiesTest  {
	@Test
	
	public void testHighestPrimeFactor(){
//		assertEquals(97, Utilities.getLargestPrimeFactor(100),0);
//		assertEquals(7, Utilities.getLargestPrimeFactor(10),0);
		
		assertEquals(6857, Utilities.getLargestPrimeFactor(600851475143d),0);
		
	}

	@Test
	public void testIsPrime(){
		assertEquals(true,Utilities.isPrime(5));
		assertEquals(true,Utilities.isPrime(7));
		assertEquals(true,Utilities.isPrime(29));
		assertEquals("9 is not a prime number",false,Utilities.isPrime(9));
		assertEquals("100 is not a prime number",false,Utilities.isPrime(100));
		assertEquals("2147483647 is a prime number",true,Utilities.isPrime(2147483647));
		assertEquals("618970019642690137449562111 is a prime number",true,Utilities.isPrime(618970019642690137449562111d));
	}
}
