package com.example.string;

import java.util.Scanner;

//22.18.Java program to string convert lower case without using lower case function

public class ConvertLowerCase {
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter the String:");
    	 String str=sc.nextLine();
    	 
    	 System.out.print("Convert Lower Case:");
    	 for(int i=0; i<str.length(); i++) {
    		 
    		 char ch=str.charAt(i);
    		 
    		 if(ch>='A'&&ch<='Z') {
    			 
    			 ch=(char)(ch+32);
    			 System.out.print(ch);
    		 }else {
    			 System.out.print(ch);
    		 }
    	 }
    		 
    		 
	}
}
