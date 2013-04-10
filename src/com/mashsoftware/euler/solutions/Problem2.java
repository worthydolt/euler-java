package com.mashsoftware.euler.solutions;


public class Problem2 {
	static int fibonacci_num_1 = 1;
	static int fibonacci_num_2 = 1;
	static int even_fib_sum=0;

	public static void main (String [] args){
		int next_fib_num;
		while (fibonacci_num_2<4000000){
			next_fib_num = fibonacci_num_1 + fibonacci_num_2;
			if (next_fib_num%2 == 0){
				even_fib_sum += next_fib_num;
			}
			fibonacci_num_1 = fibonacci_num_2;
			fibonacci_num_2 = next_fib_num;
		}
		System.out.println(even_fib_sum);


	}
}
