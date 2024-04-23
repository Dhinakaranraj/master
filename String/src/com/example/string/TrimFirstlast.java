package com.example.string;

import java.util.Scanner;

//17.Java program to string trim() method without using trim function

public class TrimFirstlast {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		int f=0; int l=str.length()-1;
		
		boolean first=false; 
		boolean last=false;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==' '&&first==false) {
				
				f++;
			}else {
				first=true;
			}
			if(str.charAt(l)==' '&&last==false) {
				l--;
			}else {
				last=true;
			}
			if(first==true&&last==true) {
				break;
			}
		}
		
		for(int i=f; i<=l; i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}

//class HelloWorld {
//    public static void main(String[] args) {
//        String str="    hard work never fails    ";
//        System.out.println(str.length());
//        str=str.trim();
//        System.out.println(str.length());
//        System.out.println(str);
//    }
//}
