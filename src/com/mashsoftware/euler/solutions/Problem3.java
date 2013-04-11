package com.mashsoftware.euler.solutions;


public class Problem3 {
	public static void main (String [] args){
		if (args.length<1){
			System.out.println("Pass in target integer");
		System.exit(0);
		}
		long target = Long.parseLong(args[0]);
		
		System.out.println(Utilities.getLargestPrimeFactor(target));
		
	}

}
