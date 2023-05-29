package org.example;

/**
 * created by Joseph Yacoub  on 24 May 2023
 */

public class PerformanceTestFunctions {

        public static void myBubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    public static long myFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return myFibonacciRecursive(n - 1) + myFibonacciRecursive(n - 2);
    }

    public static long myFibonacciIterative(int n) {

        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
