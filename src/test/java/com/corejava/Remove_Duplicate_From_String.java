package com.corejava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Remove_Duplicate_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String string = "i like java java coding java and you do you interested in java coding coding.";

        string = Arrays.stream(string.split("\\s+")).distinct().collect(Collectors.joining(" "));

        System.out.println(string);
	}

}
