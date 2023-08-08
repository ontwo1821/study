package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//주어진 숫자의 배수 표시
public class Solution5 {
    public static void main(String[] args) {
        int n = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n+1];
        initZeroArray(x, n+1);
        i = sc.nextInt();
        markMultiple(x, i, n);
        printArray(x, n);
    }
}
