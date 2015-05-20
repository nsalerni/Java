/*
 * SelectionSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class SelectionSort
{
    /*
      Given an array, sort it using Selection Sort. Time Complexity: O(n^2).
      Note: The algorithm works by selecting the smallest unsorted item and then swapping it with the item in the next position to be filled.
      @param array - The array to sort.
    */
    public static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for (int j = i+1; j < array.length; j++)
            {
                // If the array element at index j is less than the value at i, j becomes the new min.
                if (array[j] < array[min])
                    min = j;

                // Swap the elements at (i) and (min).
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
