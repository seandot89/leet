package com.main;

public class isPrime {

	public static void main(String[] args) {
		
		long N = 600851475143L;
		
		//find the largest odd number
		while(N % 2 == 0)
			N/=2;
		
		//traverse odd numbers starting at 3 since every prime number is also odd
		for(long factor = 3; factor < N; factor+=2) {
			
			//if N is evenly divisible by the factor, then divide it and keep
			//dividing until N is a prime number. This will result in the largest prime number
			while(N % factor == 0 && factor < N) {
				N/=factor;
			}
		}
		
		System.out.println(N);
		
		
	}
	

}
