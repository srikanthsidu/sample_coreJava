package javaTopics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "S$r#@ik&an**th";
        String output = reverseString(input);
        //System.out.println(output);
	}
	
	public static String reverseString(String str) {
		String input = "S$r#@ik&an**th";
        // remove non-alphanumeric characters
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(str);
        
     // reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        // insert non-alphanumeric characters back into the reversed string
        StringBuilder outputBuilder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                outputBuilder.append(c);
            } else {
                outputBuilder.append(reversed.charAt(j));
                j++;
            }
       }
        
       return str.toString();
    }
}
