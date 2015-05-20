/*
 * InsertionSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class InsertionSort
{
    /*
      Given an array, sort it using Insertion Sort. Time Complexity: O(n^2).
      Note: To sort unordered list of elements, we remove its entries one at a time and then insert each of them into a sorted part.
      @param array - The array to sort.
    */
    public static void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int index = array[i];
            int j = i;

            while (j > 0 && array[j-1] > index)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = index;
        }
    }
}
