package com.example.string;

import java.util.Scanner;

//15.Java program to contains true or false for given string 

public class Contains {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		System.out.print("Enter the Contains String:");
		String str1=sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==str1.charAt(0)) {
				
				int count=0;
				
				for(int j=0; j<str1.length(); j++) {
					
					if(str1.charAt(j)==str.charAt(i+j)) {
						count++;
						
					}
				}
				if(count==str1.length()) {
					System.out.print("Yes Contains");
					break;
				}else {
					System.out.print("No Contains");
				}
			}
		}
			
			
		
	}

}
