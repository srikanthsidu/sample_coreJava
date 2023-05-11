package com.corejava;


public class Revese_String_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "My Name is Srikanth";
		
		int [] z= {2,3,4,9,10,11,9999999,0};
		int z1=z.length;
		System.out.println("String length is " + z1);
		
		String[]str2= str.split("");
		int x= str.length();
		System.out.println("String x length is " + x);
		int y= str2.length;
		System.out.println("String y length is " + y);
		//System.out.println(str2.toString());
		
		for (String a2 : str2)
		{
			System.out.print(a2);
			
		}
			
		System.out.println();
				
		for (int i=0; i<= str2.length-1; i++)
		{
			System.out.print(str2[i]+"");
		}
		
		  System.out.println();
		  for (int j=str2.length-1; j>=0 ; j--) 
		  {
		  System.out.print(str2[j]);
		  }
		 
	}
}