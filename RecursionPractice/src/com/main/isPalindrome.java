package com.main;

public class isPalindrome {

	public static void main(String[] args) {

		String test1 = "dffsaada";
		String test2 = "aabbaa";
		String test3 = "ttacBcatt";
		
		System.out.println(isPalin(test1));
		System.out.println(isPalin(test2));
		System.out.println(isPalin(test3));

	}
	
	public static boolean isPalin(String s){
		if(s.length()==0||s.length()==1)
			return true;
		if(s.charAt(0)==s.charAt(s.length()-1))
			return isPalin(s.substring(1,s.length()-1));
		
		
		return false;
		
	}

}
