package com.mashsoftware.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

	//returns an array of prime numbers up to and including the passed-in argument
	public static List getPrimes(double top){
		List primes = new ArrayList<Integer>();
//		int [] primes = new int[top];
		factors:
		for (int i=1; i<top; i+=2){
			boolean prime = true;
			is_it_prime:
			for (int j=3; j < i; j+=2){
				if (i%j == 0){
					prime = false;
					break is_it_prime;					
				}
			}
		if (prime){
			primes.add(i);
		}
		}
		return primes;		
	}
	public static double getLargestPrimeFactor(double number){
		double largest_prime_factor = 0d;
		double starting=number;
		//we want to loop over odd numbers 
		if (number % 2d == 0){
			starting -=1d;
		}
		for (double d=Math.sqrt(starting); d>1d; d-=2d){
			
			if (isPrime(d) && (number % d == 0)){
				largest_prime_factor = d;
				break;
			}

		}	
		return largest_prime_factor;		
	}

	public static boolean isPrime(double candidate){
		double start;
		if (candidate <= 9d){
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