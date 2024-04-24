package com.example.string;

import java.util.Scanner;

//24.java program to start with method with using start with method

public class StartWithFun {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		System.out.print("Enter the 2nd string:");
		String str1=sc.nextLine();
		
		int count=0;
		for(int i=0; i<str1.length(); i++) {
			
			if(str.charAt(i)==str1.charAt(i)) {
				
				count++;
				continue;
			}else {
				System.out.print("Not start with");
				break;
			}
		}
		if(count==str1.length()) {
			System.out.print("start with");
		}
		
		
	}
}

//class HelloWorld {
//    public static void main(String[] args) {
//        String s1="Today is funday";
//        String s2="Today";
//        boolean result=s1.startsWith(s2);
//        System.out.print(result);
//    }
//}
