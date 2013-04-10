package com.mashsoftware.euler.solutions;

import java.util.List;

public class Problem3 {
	public static void main (String [] args){
		if (args.length<1){
			System.out.println("Pass in target integer");
		System.exit(0);
		}
		double target = Double.parseDouble(args[0]);
		
		System.out.println(Utilities.getLargestPrimeFactor(target));
		
	}

}
