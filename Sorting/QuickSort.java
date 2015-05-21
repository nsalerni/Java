/*
 * QuickSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class QuickSort
{
    /*
      Given an array, sort it using Quick Sort. Time Complexity: O(n log n).
      Note: Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays:
            the low elements and the high elements, and then recursively sorts the sub-arrays.
      @param array      - The array to sort.
      @param startIndex - The starting index of the array where you want to begin the sort.
      @param endIndex   - The end index of the array where you want to end the sort.
    */
    public static void quickSort(int[] array, int startIndex, int endIndex)
    {
        int i = startIndex; int j = endIndex;
        int temp = 0;
        int pivot = array[(startIndex + endIndex) / 2]; // Choose a pivot (roughly the mid point of the array).

        // Partition the array into items less than the pivot (left side) and items greater than the pivot (right side).
        while (i <= j)
        {
            // If the element on the left half is smaller than the pivot, move to the next index.
            while (array[i] < pivot)
            {
                i++;
            }
            // If the element on the right half is greater than the pivot, move to the previous index.
            while (array[j] > pivot)
            {
                j--;
            }
            // Swap the elements at index i and j.
            if (i <= j)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // Recurse over the right subarray.
        if (startIndex < j)
        {
            quickSort(array, startIndex, j);
        }
        // Recurse over the left subarray.
        if (i < endIndex)
        {
            quickSort(array, i, endIndex);
        }
    }
}
