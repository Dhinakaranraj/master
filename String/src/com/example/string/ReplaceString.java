package com.example.string;

import java.util.Scanner;

//16.Java program to string replace first

public class ReplaceString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		
		Contains(str);
	}

	private static void Contains(String str) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the contains:");
		String str1=sc1.nextLine();
		
		int start=0; int end=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==str1.charAt(0)) {
				
				start=i;
				int count=0;
				
				for(int j=0; j<str1.length(); j++) {
					if(str1.charAt(j)==str.charAt(i)) {
						count++;
						i++;
						end=i;
					}
				}
				if(count==str1.length()) {
					System.out.println("Yes,Contains");
					System.out.println(start+" "+end);
					replaceFirst(str,"jasmine",start,end);
				    break;
				}else {
					System.out.print("No,Contains");
				}
			}
		}
	}

	private static void replaceFirst(String old, String replace, int start, int end) {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0; i<start; i++) {
			
			sb.append(old.charAt(i)); //a
		}
		sb.append(replace+" "); // a jasmine 
		
		for(int i=end; i<old.length(); i++) {
			
			sb.append(old.charAt(i));
		}
		System.out.print(sb);
	}
}

//class HelloWorld {
//    public static void main(String[] args) {
//        
//        String s1="a rose is a rose is a rose";
//        s1=s1.replaceFirst("rose","jasmine");
//        System.out.print(s1);
//    }
//}

	
