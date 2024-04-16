package com.example.string;

import java.util.Scanner;

//9.Java Program to replace lower-case characters with upper-case and vice-versa

public class LowerUpperCaseChanges {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
    	
        StringBuilder str1 = new StringBuilder(); 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
    		
            if (Character.isLowerCase(ch)) {
                str1.append(Character.toUpperCase(ch)); 
            } else {
                str1.append(Character.toLowerCase(ch)); 
            }
        }
        System.out.println(str1.toString()); 
    }
}
