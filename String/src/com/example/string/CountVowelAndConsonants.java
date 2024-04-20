package com.example.string;

//10.Java Program to count the total number of vowels and consonants in a string

public class CountVowelAndConsonants {
    public static void main(String args[]) {
    	
        String str = "This is a really simple sentence";
        str = str.toLowerCase();
        System.out.println("String: " + str);

        int countConsonants = 0;
        int countVowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }
        }

        System.out.println("Number of consonants: " + countConsonants);
        System.out.println("Number of vowels: " + countVowels);
    }
}
