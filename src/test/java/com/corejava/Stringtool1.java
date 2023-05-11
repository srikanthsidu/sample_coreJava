package com.corejava;

public class Stringtool1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch1;
		String nstr="";
        String str1="srikanth Katla";
        System.out.println("Declared string is  - " + str1);
        int strlrn= str1.length();
        System.out.println("String length is   - " + strlrn);
        try {
        for (int i=0; i<=strlrn; i++)
        {
            ch1 = str1.charAt(i);
            //System.out.println("String charactor is   - " + ch1);
            nstr= ch1+nstr;
        }
            System.out.println("Reversed word: "+ nstr);
    
        
		}
        catch(StringIndexOutOfBoundsException e) {
        	
            
			System.out.println("String index out of bounds. String length: " + strlrn );
        }
        }

	}


