/*
 * Pangram.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.*;

public class Pangram
{
    /*
      Given a string str, determine whether or not it is a pangram.
      Note: Pangrams are words or sentences containing every letter of the alphabet at least once.
      @param str - The input string.
      @return      Whether or not it is a pangram
    */
    public static boolean isPangram(String str)
    {
        Set<Character> lettersRemaining = new HashSet<>();

        for (char ch = 'a'; ch <= 'z'; ch ++)
        {
            lettersRemaining.add(ch); // Add each letter of the alphabet to the set.
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++)
        {
            lettersRemaining.remove(str.charAt(i)); // Remove the letter in the string from the set.
        }

        // If there are no letters remaining in the set, then the string is a pangram.
        return lettersRemaining.isEmpty();
    }
}
