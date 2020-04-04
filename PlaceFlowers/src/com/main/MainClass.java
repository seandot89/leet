package com.main;

public class MainClass {

	public static void main(String[] args) {
		int[] flowerBed = {1,0,0,0,1};
		int[] flowerBed2 = {1,0,0,0,1};
		
		System.out.println(canPlaceFlowers(flowerBed, 1));
		
		
	}
	
	public static boolean canPlaceFlowers(int[] fp, int n) {
		int count = 0;
		
		for(int i=0; i<fp.length; i++) {
			if((fp[i]==0) && (i==0 || fp[i-1]==0) && (i==fp.length-1 || fp[i+1]==0)) {
				fp[i] = 1;
				count++;
			}
			if(count>=n)
				return true;
				
		}
		
		return false;
	}
}
