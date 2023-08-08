package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//순차 탐색
public class Solution12 {
    public static void main(String[] args) {
        int m = 0, n = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        k = sc.nextInt();
        m = sequentialSearch(x, n, k);
        if(m >= 0) {
            System.out.println((m + 1) + "번째 존재");
        } else {
            System.out.println("존재 하지 않음");
        }
    }
}
