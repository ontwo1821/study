package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//주어진 숫자보다 작거나 같은 숫자 표시하기
public class Solution6 {
    public static void main(String[] args) {
        int n = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n], r = new int[n];
        initRandomArray(x, n);
        initZeroArray(r, n);
        k = sc.nextInt();
        compareElement(x, r, n, k);
        printArray(r, n);
    }
}
