/*
 * BubbleSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class BubbleSort
{
    /*
      Given an array, sort it using Bubble Sort. Time Complexity: O(n^2).
      Note: The algorithm works by comparing each item in the list with the item next to it, and swapping them if required.
            In other words, the largest element has bubbled to the top of the array. The algorithm repeats this process until
            it makes a pass all the way through the list without swapping any items.
      @param array - The array to sort.
    */
    public static void BubbleSort(int[] array)
    {
        for (int i = (array.length - 1); i >= 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                // If the element at (j-1) is greater than the element at (j), then the elements are out of order. Swap them.
                if (array[j-1] > array[j])
                {
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
                }
            }
        }
    }
}
