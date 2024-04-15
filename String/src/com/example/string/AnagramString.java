package com.example.string;

import java.util.Arrays;

//4.Java Program to determine whether two strings are the anagram

public class AnagramString {
	public static void main(String args[]) {
		
		String str="Listen";
		String str1="Slient";
		
		System.out.println(str);
		System.out.println(str1);
		
		if(str.length()!=str1.length()) {
			System.out.print("Not a Anangram String");
		}
		
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1)) {
			System.out.print("Anagram String");
		}else {
			System.out.print("Not a Anagram String");
		}
		
		
	}

}
