package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//bubble sort
public class Solution16 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        bubbleSort(x, n);
        System.out.println();
        printArray(x, n);
    }
}
