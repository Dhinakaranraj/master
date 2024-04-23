package com.example.string;

import java.util.Scanner;

//20.Java program to string strip trailing without using strip trailing method

public class StripTrailing {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		System.out.println(str.length());
		
		int end=0;
		
		for(int i=str.length()-1; i>=0; i--) {
			
			char ch=str.charAt(i);
			
			if(ch==' ') {
				continue;
			}else {
				end=i;
				break;
			}
		}
		for(int i=0; i<=end; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("hello");
		
	}

}

//class HelloWorld {
//    public static void main(String[] args) {
//        String str="abcdgfgh    ";
//        System.out.print(str.length());
//       str=str.stripTrailing();
//       System.out.print(str);
//       System.out.print(str.length());
//       System.out.print("hello");
//    }
//}
