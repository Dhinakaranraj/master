package com.example.string;

import java.util.Scanner;

//9.Java Program to replace the spaces of a string with a specific character

public class ReaplceTheSpaces {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		
		String modify=str.replace(' ', '-');
		
		System.out.print(modify);
	}
    
}
