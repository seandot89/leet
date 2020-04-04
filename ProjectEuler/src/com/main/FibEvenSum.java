package com.main;

public class FibEvenSum {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int temp = 0;
		int sum = 0;
		
		while(b < 4000000) {
			if(b % 2 == 0) {
				sum = sum + b;
			}
			
			temp = a + b;
			a = b;
			b = temp;
		}
		
		System.out.println(sum);

	
		
	

	}

}
