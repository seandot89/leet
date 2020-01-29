package com.main;

public class lcp {

	public static void main(String[] args) {
		// prints longest common prefix of all strings contained in array lcp1
		String [] lcp1 = {"flower","flow","flowight"};
		
		String lcp2 = longestCommonPrefix(lcp1); 
		
		System.out.println(lcp2);
		

	}
	
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c)
                    return strs[0].substring(0,i);
            }
        }
    return strs[0];
    }

}
