package com.example.string;

import java.util.Scanner;

//28.Program to print first non-repeated character in a string

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
       

        for(int j=0; j<str.length(); j++) {
        	char ch=str.charAt(j);
        	 boolean repeated=false;
        for (int i = 0; i < str.length(); i++) {
   
        	char ch1=str.charAt(i);
        	if(i!=j) {
        		
        		if(ch==ch1) {
        			repeated=true;
        			break;
        		}
        	}
        }
        if(repeated==false) {
         	System.out.print("First non-repeated character: "+ch);
         	break;
        }
    
       
        	
        }
    }
        
}
