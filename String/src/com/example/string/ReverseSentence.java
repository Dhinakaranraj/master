package com.example.string;

import java.util.Scanner;

//21.Java program to string reverse sentence 

public class ReverseSentence {
      public static void main(String[] args) {
		
    	  Scanner sc=new Scanner(System.in);
    	  System.out.print("Enter the String:");
    	  String str=sc.nextLine();
    	  
    	  int start=0; int end=str.length()-1;
    	  
    	  for(int i=str.length()-1; i>=0; i--) {
    		  
    		  if(str.charAt(i)!=' ') {
    			  continue;
    		  }else {
    			  start=i+1;
    			  reverse(str,start,end);
    			  end=i-1;
    		  }
    	  }
    	  reverse(str,0,end);
	}

	private static void reverse(String str, int start, int end) {

		String s2="";
		
		for(int i=start; i<=end; i++) {
			s2=s2+str.charAt(i);
		}
		System.out.print(s2+" ");
	}
}
