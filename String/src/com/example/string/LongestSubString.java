package com.example.string;

import java.util.HashSet;
import java.util.Scanner;

//7.Java Program to find the longest repeating sequence in a string

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String longestsequence = longest(str);
        System.out.println("Longest repeating sequence: " + longestsequence);
    }

    private static String longest(String str) {
        HashSet<Character> set = new HashSet<>();
        String longestOverAll = "";
        String longestTillNow = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                longestTillNow = "";
                set.clear();
            }
            set.add(ch);
            longestTillNow += ch;

            if (longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }
        return longestOverAll;
    }
}
