/*
 * Anagram.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class Palindrome
{
    /*
      Determine whether or not a given string str is a palindrome.
      Note: A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
      @param str - The input string.
      @return      Whether or not the given string str is a palindrome.
    */
    public static boolean isPalindrome(String str)
    {
        if (str.length() <= 1)
        {
            return true; // Base case: A string of length 0 or 1 is always a palindrome.
        }
        else
        {
            if (str.charAt(0) == str.charAt(str.length() - 1)) // If the first and last character in the string are the same.
            {
                return isPalindrome(str.substring(1, str.length() - 1)); // Recurse over the smaller substring.
            }
            return false; // If at any point the start and end character of the substring are not equal, then the string is not a palindrome.
        }
    }
}
