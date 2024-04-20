package com.example.string;

import java.util.Scanner;

//12.Java Program to find Reverse of the string

public class ReverseString {
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter the String:");
    	 String str=sc.nextLine();
    	 
    	 String rev="";
    	 
    	 for(int i=0; i<str.length(); i++) {
    		 char ch=str.charAt(i);
    		 rev=ch+rev;
    	 }
    	 System.out.print("Reverse String: "+rev);
	}
}
