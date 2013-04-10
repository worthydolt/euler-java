package com.mashsoftware.euler.solutions;

public class Problem1 {
	private static int [] winners;
	public static void main (String [] args) {
	int idx=0;	
	winners = new int[1000];
		for (int i=1; i<1000; i++){
			if (i%3 == 0 || i%5==0){
				winners[idx]=i;
				idx++;
			}
		}
		int sum=0;
		for (int j=0;j<winners.length;j++)
			sum+=winners[j];
			System.out.println(sum);
	}
}
