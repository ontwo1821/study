package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//소수 구하기
public class Solution10 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n+1];
        initZeroArray(x, n+1);
        sieveOfEratosthenes(x, n);
        printPrimeNumber(x, n);
    }
}
