package com.example.string;

//13.Java Program to determine whether one string is a rotation of another

public class RotateString {
    
    public static boolean isRotation(String s1, String s2) {
        // Step 1: Check if both strings have the same length
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Step 2: Concatenate s1 with itself
        String concatenated = s1 + s1;
        
        // Step 3: Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
    }
    
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defabc";
        
        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
    }
}
