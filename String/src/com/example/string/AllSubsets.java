package com.example.string;

import java.util.Scanner;

//6.Java Program to find all subsets of a string

public class AllSubsets {
    public static void main(String args[]) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the String: ");
    	String str=sc.nextLine();
    	
    	for(int i=0; i<str.length(); i++) {              //i=0      
    		for(int j=i+1; j<=str.length(); j++) {       //j=0+1=1; j=1, 
    			System.out.println(str.substring(i,j));  //0,1=a    
    		}
    	}
    }
}
