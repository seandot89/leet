package com.main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(addBinary("111","111"));
		
	}
	
	 public static String addBinary(String a, String b) {
	        
	        char[] aAry = a.toCharArray();
	        char[] bAry = b.toCharArray();
	        
	        boolean aLrg = false;
	        boolean bLrg = false;
	        
	        if(aAry.length>bAry.length){
	            aLrg = true;
	        }
	        if(bAry.length>aAry.length){
	            bLrg = true;
	        }
	        
	        char[] rtnAry = new char[Math.max(aAry.length, bAry.length)];
	        int i = 1; 
	        
	        int carry = 0;
	        
	        while((aAry.length-i>=0)&&(bAry.length-i>=0)){
	            
	            int val = Character.getNumericValue(aAry[aAry.length-i]) + 
	                Character.getNumericValue(bAry[bAry.length-i]) + carry;
	            carry = 0;
	            if(val<2){
	                rtnAry[rtnAry.length-i] = (char)(val+'0');
	                carry = 0;
	            }   
	            else if(val == 2){
	                rtnAry[rtnAry.length-i] = '0';
	                carry = 1;
	            }else if(val == 3){
	                rtnAry[rtnAry.length-i] = '1';
	                carry = 1;
	            }
	                
	            i++;
	        }
	        
	        if(aLrg){
	            while(aAry.length - i >=0){
	                int val = Character.getNumericValue(aAry[aAry.length-i]) + carry;
	                if(val<2){
	                    rtnAry[rtnAry.length-i] = (char)(val+'0');
	                    carry = 0;
	                }else if(val==2){
	                    rtnAry[rtnAry.length-i] = '0';
	                    carry = 1;
	                }
	                i++;
	            }
	        }
	        if(bLrg){
	            while(bAry.length - i >=0){
	                int val = Character.getNumericValue(bAry[bAry.length-i]) + carry;
	                if(val<2){
	                    rtnAry[rtnAry.length-i] = (char)(val+'0');
	                    carry = 0;
	                }else if(val==2){
	                    rtnAry[rtnAry.length-i] = '0';
	                    carry = 1;
	                }
	                i++;
	            }
	        }
	        
	        if(carry!=0){
	            char[] rtnAry2 = new char[rtnAry.length+1];
	            rtnAry2[0] = '1';
	            for(int j = 0; j < rtnAry.length; j++){
	                rtnAry2[j+1] = rtnAry[j];
	            }
	            return new String(rtnAry2);
	        }
	        
	        else return new String(rtnAry);
	        

	        
	    }
}
