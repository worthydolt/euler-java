package com.mashsoftware.euler.solutions;


public class Utilities {

	
	/*
	 * Takes a long as input and figures out what its largest *prime* 
	 * factor is
	 */
	public static long getLargestPrimeFactor(long number){
		long dividend = number;
		int divisor = 2;

		while (divisor < dividend){
			if (dividend % divisor == 0){
				dividend = dividend / divisor;
			}
			divisor++; 
		}
		return divisor;
	}

	/*
	 * Takes a whole number as input and figures out whether it's prime
	 */
	public static boolean isPrime(double candidate){
		double start;
		if (candidate <= 25d){
			start = candidate;
		}else{
			start = Math.sqrt(candidate);
		}
		for (double i=3;i<start; i+=2d){
			if (candidate % i == 0){
				return false;
			}
		}
		return true;
	}
}