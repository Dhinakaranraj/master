package com.example.string;

import java.util.Scanner;

//11.Java Program to determine whether a given string is palindrome

public class PalindromeString {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("Enter the String:");
		 String str=sc.nextLine();
		 
		 String Rev=""; 
		 
		 for(int i=0; i<str.length(); i++) {
			 char ch=str.charAt(i);
			 Rev=ch+Rev;
			 
		 }
		if(str.equals(Rev)) {
			System.out.print("Palindrome String");
		}else {
			System.out.print("Not Palindrome String");
		}
	}

}
