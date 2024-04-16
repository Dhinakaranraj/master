package com.example.string;

import java.util.Scanner;

//8.Java Program to remove all the white spaces from a string

public class RemoveWhiteSpaces {
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter the String: ");
    	 String str=sc.nextLine();
    	 
    	 str=str.replaceAll("\\s+","");
    	 
    	 System.out.print("String after removing all the white spaces: "+str);
	}
	
}
