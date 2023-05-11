package com.corejava;

import java.util.Arrays;

public class Java_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,4,5,6};
		int b[] = {3,8,9};
				
		int lena = a.length;
		int lenb = b.length;
		
		int c[] = Arrays.copyOf(a, lena+2);
		int lenc = c.length;
		System.out.println(lenc);
		
		
		int result[] = new int[lena+lenc];
		int lenresult = result.length;
		
	    System.arraycopy(c, 0, result, 0, lena);
	    System.arraycopy(b, 0, result, lenc, lenb);
		
		System.out.println("Result lenaght is " + lenresult);
		
		for(int ele:result) {
			
			System.out.println("Array elements list is " + ele);
			
		}
		

	}

}
