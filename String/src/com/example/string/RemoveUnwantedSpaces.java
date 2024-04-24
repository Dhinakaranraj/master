package com.example.string;

import java.util.Scanner;

//26.java program to write remove unwanted spaces

public class RemoveUnwantedSpaces {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		boolean first_spaces=false;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch =str.charAt(i);
			
			if(ch!=' ') {
				System.out.print(ch);
				first_spaces=true;
			}else if(first_spaces==true) {
				System.out.print(ch);
				first_spaces=false;
			}
		}
	}

}
