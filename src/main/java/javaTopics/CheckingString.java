package javaTopics;

public class CheckingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Hello, World!");
	        String a = "hello";
			String b = "hello";
			String c = new String("hello");

			System.out.println(a == b);
			System.out.println(a.equals(b));
			System.out.println(a == c);
			System.out.println(a.equals(c));

	}

}
