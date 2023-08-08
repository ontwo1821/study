package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//insertion sort
public class Solution15 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        insertionSort(x, n);
        printArray(x, n);
    }
}
