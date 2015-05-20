/*
 * Fibonacci.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
public class Fibonacci
{
    /*
      You are given an integer, number. The following method determines if number is an element of the Fibonacci sequence.
      @param number - The number that may or may not be in the Fibonacci sequence.
      @return         Whether or not the number is an element of the Fibonacci sequence.
    */
    public static boolean isFibo(int number)
    {
        long[] fib = new long[200]; // Array to hold all fib values.
        fib[0] = 0; fib[1] = 1;     // Manually fill the first two elements of the array.

        for (int i = 2; i <= 75; i++)
        {
            fib[i] = fib[i-1] + fib[i-2];
            if (fib[i] == number)
            {
                return true; // Number is an element of the Fibonacci sequence.
            }
            else if (fib[i] > number)
            {
                return false; // Number isn't an element of the Fibonacci sequence.
            }
            else continue;
        }
        return false;
    }
}
