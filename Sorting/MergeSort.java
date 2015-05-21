/*
 * MergeSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class MergeSort
{
    /*
      Given an array, sort it using Merge Sort. Time Complexity: O(n log n).
      To sort unordered list of elements, we remove its entries one at a time and then insert each of them into a sorted part.
      @param array      - The array to sort.
      @param startIndex - The starting index of the array where you want to begin the sort.
      @param endIndex   - The end index of the array where you want to end the sort.
    */
    public static void mergeSort(int[] array, int startIndex, int endIndex)
    {
        int sizeFirstHalf; // Size of the first half of the array.
        int sizeSecondHalf; // Size of the second half of the array.

        if (endIndex > 1)
        {
           // Compute sizes of the two halves.
           sizeFirstHalf = endIndex / 2;
           sizeSecondHalf = endIndex - sizeFirstHalf;

           mergeSort(array, startIndex, sizeFirstHalf);                  // Sort data[startIndex] through data[startIndex+sizeFirstHalf-1].
           mergeSort(array, startIndex + sizeFirstHalf, sizeSecondHalf); // Sort data[startIndex+sizeFirstHalf] to the data[endIndex].

           // Merge the two sorted halves.
           merge(array, startIndex, sizeFirstHalf, sizeSecondHalf);
        }
    }

    /*
      Merge the two sorted halves of the array into a single sorted array.
      @param array          - The array to sort.
      @param startIndex     - The starting index of the array where you want to begin the sort.
      @param sizeFirstHalf  - The size of the first half of the array.
      @param sizeSecondHalf - The size of the second half of the array.
    */
    private static void merge(int[ ] array, int startIndex, int sizeFirstHalf, int sizeSecondHalf)
    {
        int[] temp = new int[sizeFirstHalf + sizeSecondHalf]; // Allocate the temporary array.
        int copied  = 0; // Number of elements copied from array to temp.
        int copied1 = 0; // Number copied from the first half of array.
        int copied2 = 0; // Number copied from the second half of array.
        int i;           // Array index to copy from temp back into array.

        // Merge elements, copying from two halves of array to the temporary array.
        while ((copied1 < sizeFirstHalf) && (copied2 < sizeSecondHalf))
        {
           if (array[startIndex + copied1] < array[startIndex + sizeFirstHalf + copied2])
              temp[copied++] = array[startIndex + (copied1++)];
           else
              temp[copied++] = array[startIndex + sizeFirstHalf + (copied2++)];
        }

        // Copy any remaining entries in the left and right subarrays.
        while (copied1 < sizeFirstHalf)
           temp[copied++] = array[startIndex + (copied1++)];
        while (copied2 < sizeSecondHalf)
           temp[copied++] = array[startIndex + sizeFirstHalf + (copied2++)];

        // Copy from temp back to the array.
        for (i = 0; i < sizeFirstHalf + sizeSecondHalf; i++)
            array[startIndex + i] = temp[i];
    }
}
