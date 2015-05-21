/*
 * LongestRepeatingSubstring.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.Arrays;

public class LongestRepeatingSubstring
{
    /*
      Find the longest common prefix of strings firstStr and secondStr.
      @param firstStr  - The first string.
      @param secondStr - The second string.
      @return            The longest common prefix of the two strings.
    */
    public static String lcp(String firstStr, String secondStr)
    {
        int minLen = Math.min(firstStr.length(), secondStr.length()); // Min length of both strings.
        for (int i = 0; i < minLen; i++)
        {
            if (firstStr.charAt(i) != secondStr.charAt(i))
            {
                return firstStr.substring(0, i);
            }
        }
        return firstStr.substring(0, minLen);
    }

    /*
      Find the the longest repeated string in str.
      @param str - The input string.
      @return    - The longest repeated string in str.
    */
    public static String lrs(String str)
    {
        int len = str.length();
        String[] suffixes = new String[len];

        for (int i = 0; i < len; i++)
        {
            suffixes[i] = str.substring(i, len);
        }

        Arrays.sort(suffixes); // Sort the array.

        String lrs = "";

        for (int i = 0; i < len - 1; i++)
        {
            String x = lcp(suffixes[i], suffixes[i+1]);
            // If the length of x is longer than the current lrs, then replace it.
            if (x.length() > lrs.length())
            {
                lrs = x;
            }
        }
        return lrs;
    }
}
