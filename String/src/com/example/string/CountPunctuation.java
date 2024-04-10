package com.example.string;

//2.Java Program to Count the Total Number of Punctuation Characters Exists in a String

public class CountPunctuation {
	public static void main(String args[]) {
		
		String str="He said, 'The mailman loves you.' I heard it with my own ears.";
		
		System.out.print("String: "+str);
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='"'||str.charAt(i)=='!'||str.charAt(i)=='?'||
					str.charAt(i)==';'||str.charAt(i)==':') {
				count++;
			}
		}
		System.out.print("\nCount Punctuation: "+count);
	}

}


////Define a string containing all punctuation characters
//String punctuation = ",.\"!?:;";
//
//for (int i = 0; i < str.length(); i++) {
//    // Check if the character at index i is a punctuation character
//    if (punctuation.contains(String.valueOf(str.charAt(i)))) {
//        count++;
//    }
