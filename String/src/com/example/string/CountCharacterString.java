package com.example.string;

//1.Java Program to count the total number of characters in a string

public class CountCharacterString {
	public static void main(String args[]) {
		
		String str="Hi Welcome to String";
		
		System.out.print("String: "+str);
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.print("\nTotal Number Of characters: "+count);
	}

}
