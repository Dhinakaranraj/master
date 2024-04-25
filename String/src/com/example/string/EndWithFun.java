package com.example.string;

import java.util.Scanner;

//29.java program to end with method without using end with method

public class EndWithFun {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		System.out.print("Enter the 2nd String:");
		String str1=sc.nextLine();
		boolean endswith=true;
		
		int len=str.length()-1;
			for(int j=str1.length()-1; j>=0; j--) {
				char ch=str.charAt(len);
				char ch1=str1.charAt(j);
				
				if(ch==ch1) {
					len--;
					continue;
				}else {
					endswith=false;
					System.out.print("Not ends with");
					break;
				}
			}
		
		if(endswith==true) {
			System.out.print("ends with");
		}
				
	}

}
//class HelloWorld {
//    public static void main(String[] args) {
//        String str="day is fun";
//        String str1="fun";
//        boolean result=str.endsWith(str1);
//        System.out.print(result);
//    }
//}
