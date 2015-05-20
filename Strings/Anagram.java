/*
 * Anagram.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.*;

public class Anagram
{
    /*
     Determine whether two strings are anagrams of eachother (ie. they contain the same number of each character).
     For example: "the classroom" and "schoolmaster" are anagrams.
     @param firstWord   - The first string.
     @param second word - The second string.
     @return              Whether the two strings are anagrams of eachother.
    */
    public static boolean isAnagram(String firstWord, String secondWord)
    {
        // Convert both strings to character arrays and remove any whitespace.
        char[] firstWordSorted = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] secondWordSorted = secondWord.replaceAll("[\\s]", "").toCharArray();

        // Sort both arrays.
        Arrays.sort(firstWordSorted);
        Arrays.sort(secondWordSorted);

        // If both sorted arrays are the same, then the two strings are anagrams.
        return Arrays.equals(firstWordSorted, secondWordSorted);
    }
}
