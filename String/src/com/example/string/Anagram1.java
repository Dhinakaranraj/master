package com.example.string;

import java.util.Scanner;

//30.Java Program to determine whether two strings are the anagram

public class Anagram1 {
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first string:");
		String a=sc.nextLine();
		System.out.print("Enter the second string:");
		String b=sc.nextLine();
		
		char[]a1=a.toCharArray();
		char[]b1=b.toCharArray();
		
	    int count=0;
	    if(a1.length!=b1.length) {
	    	System.out.print("length not matching not compare");
	    }
	    
	    if(a1.length==b1.length) {
	    	
	    	for(int i=0; i<b1.length; i++) {
	    		
	    		char ch=b1[i];
	    		for(int j=0; j<a1.length; j++) {
	    			
	    			if(ch==a1[j]) {
	    				count++;
	    				break;
	    			}
	    		}
	    	}
	    }
	    if(count==b.length()) {
	    	System.out.print("Änagram");
	    }else {
	    	System.out.print(" Not Anagram");
	    }
		
		
	}
}
		
		