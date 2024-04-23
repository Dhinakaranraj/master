package com.example.string;

import java.util.Scanner;

//18.Java program to string convert upper case without using upper case function

public class ConvertUppercase {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&&ch<='z') {
				
				ch=(char)(ch-32);
				System.out.print(ch);
			}else {
				System.out.print(ch);
			}
		}
	}

}

//class HelloWorld {
//    public static void main(String[] args) {
//        String str="abcd1234$%^";
//       str=str.toUpperCase();
//       System.out.print(str);
//    }
//}
