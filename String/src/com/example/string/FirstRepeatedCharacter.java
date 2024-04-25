package com.example.string;

import java.util.Scanner;

//27.java program to print first repeated character 

public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		boolean repeated=false;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			for(int j=i+1; j<str.length(); j++) {
				char ch1=str.charAt(j);
				
				if(ch==ch1) {
					System.out.print("first repeated character: "+ch);
					repeated=true;
					break;
				}
			}
			if(repeated==true) {
				break;
			}
		}
		
	}

}
