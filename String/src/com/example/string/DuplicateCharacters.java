package com.example.string;

import java.util.Scanner;

//14.Java program to find the duplicate characters in a string

public class DuplicateCharacters {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		
		System.out.print("Duplicate characters:");
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			for(int j=i+1; j<str.length(); j++) {
				
				if(ch==str.charAt(j)) {
					System.out.print(ch);
					break;
				}
			}
		}
	}
	

}
