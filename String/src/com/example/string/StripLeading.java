package com.example.string;

import java.util.Scanner;

//25.java program to print strip leading without using strip leading method

public class StripLeading {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		int first=0;
		for(int i=0; i<str.length(); i++) {
			
			char ch=str.charAt(i);
			
		  if(ch==' ')
		  {
			  continue;
			 
		  }else {
			  first=i;
			  break;
		  }
		}
		for(int i=first; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
