/*
 * HeapSort.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class HeapSort
{
    private static int arrayLength; // Global variable for the array's length.

    /*
      Given an array, sort it using Heap Sort. Time Complexity: O(n log n).
      Note: Heapsort is a comparison-based sorting algorithm to create a sorted array (or list), and is part of the selection sort family.
            There are two types of heaps: Max heap and Min heap. A heap (Max/Min) is a special type of binary tree,
            where the parent nodes of the max heap is greater than its child nodes.  The other heap is a Min heap it is also a special
            type of heap which has minimum root. We can sort the array values using heap sorting algorithm.
            In this algorithm the heap build (called "heapify") is used to rebuild the heap.
      @param array - The array to sort.
    */
    public static void heapSort(int[] array)
    {
        heapify(array);
        for (int i = arrayLength; i > 0; i--)
        {
            swap(array, 0, i);
            arrayLength = arrayLength - 1;
            maxheap(array, 0);
        }
    }

    /*
      Function to build a heap. This is also used to rebuild the heap.
      @param array - The array to sort.
    */
    public static void heapify(int[] array)
    {
        arrayLength = array.length-1;
        for (int i = arrayLength / 2; i >= 0; i--)
            maxheap(array, i);
    }

    /*
      Function to swap largest element in heap.
      @param array - The array to sort.
      @param index - The index of the largest element in the array.
    */
    public static void maxheap(int[] array, int index)
    {
        int left = 2 * index;
        int right = 2 * index + 1;
        int max = index;

        if (left <= arrayLength && array[left] > array[index])
            max = left;

        if (right <= arrayLength && array[right] > array[max])
            max = right;

        if (max != index)
        {
            swap(array, index, max);
            maxheap(array, max);
        }
    }

    /*
      Function to swap two elements in an array.
      @param array - The array to sort.
      @param i     - The index of the first element to be swapped.
      @param j     - The index of the second element to be swapped.
    */
    public static void swap(int[] array, int i, int j)
    {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
