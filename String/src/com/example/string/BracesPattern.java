package com.example.string;

import java.util.Scanner;

//23.Java program to print braces pattern

public class BracesPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter a:");
		char a=sc.next().charAt(0);
		System.out.print("Enter b:");
		char b=sc.next().charAt(0);
		System.out.print("Enter the count:");
		int count=sc.nextInt();
		
		for(int i=1; i<=count; i++ ) {
			
			for(int j=1; j<=i; j++) {
				for(int k=1; k<=j; k++) {
					System.out.print(a);
				}
				for(int k=1; k<=j; k++) {
					System.out.print(b);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
