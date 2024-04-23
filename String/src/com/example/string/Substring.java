package com.example.string;

import java.util.Scanner;

//19.Java program to string sub string without using substring method

public class Substring {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		System.out.print("Enter the starting substring:");
		int n=sc.nextInt();
		System.out.print("Enter the ending substring:");
		int n1=sc.nextInt();
		
		for(int i=n; i<n1; i++) {
			
			System.out.print(str.charAt(i));
		}
		
	}

}
//class HelloWorld {
//    public static void main(String[] args) {
//        String str="abcdgfgh";
//       str=str.substring(2,5);
//       System.out.print(str);
//    }
//}
