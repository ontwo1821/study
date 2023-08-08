package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//selection sort
public class Solution14 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        selectionSort(x, n);
        printArray(x, n);
    }
}
