package com.example.string;

import java.util.Scanner;

// Java Program to divide a string in 'N' equal parts.

public class DivideAStringN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");  
        String str = sc.nextLine();
        int len = str.length();

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int n1 = len / n; 
        
        for (int i = 0; i < n; i++) { // 2 1
            String part = str.substring(i * n1, (i + 1) * n1);  
            System.out.print(part + " ");                      
        }
    }
}
