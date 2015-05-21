/*
 * BinarySearch.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class BinarySearch
{
    /*
      Search for a given key in an array. Time Complexity: O(log n).
      Note: The binary search algorithm finds the position of a specified input value (the search "key") within an array sorted by key value.
            For binary search, the array should be arranged in ascending or descending order. In each step, the algorithm compares the search key
            value with the key value of the middle element of the array. If the keys match, then a matching element has been found and its index,
            or position, is returned. Otherwise, if the search key is less than the middle element's key, then the algorithm repeats its action on
            the sub-array to the left of the middle element or, if the search key is greater, on the sub-array to the right.
            If the remaining array to be searched is empty, then the key cannot be found in the array and a special "not found" indication is returned.
      @param array - The array to be searched.
      @param key   - The value you are searching for.
    */
    public static int binarySearch(int[] array, int key)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2; // Find the mid point of the array.

            // Dertermine which half the value.
            if (key < array[mid])
                high = mid - 1;
            else if (key > array[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
