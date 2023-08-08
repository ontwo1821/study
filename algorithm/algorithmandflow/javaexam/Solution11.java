package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//순위 구하기
public class Solution11 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n], r = new int[n];
        initRandomArray(x, n);
        initZeroArray(r, n);
        ranking(x, r, n);
        printArray(r, n);
    }
}
