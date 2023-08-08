package javaexam.SelectionSort;

import static javaexam.Common.*;

public class Solution {
    static int findMinimum(int[] x, int s, int n) {
        int min = s;

        for(int i = s + 1; i < n; i++) {
            if(x[i] < x[min]) {
                min = i;
            }
        }

        return min;
    }

    static void selectionSort(int[] x, int n) {
        int min = 0, temp = 0;
        for(int i = 0; i < n; i++) {
            min = findMinimum(x, i, n);
            temp = x[min];
            x[min] = x[i];
            x[i] = temp;
        }
    }

    public static void main(String[] args) {
        int len = 10;
        int[] x = new int[len];
        initRandomArray(x, len);
        System.out.println();
        selectionSort(x, len);
        printArray(x, len);
    }
}
