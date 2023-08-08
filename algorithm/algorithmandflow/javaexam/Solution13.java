package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//이진 탐색
public class Solution13 {
    public static void main(String[] args) {
        int m = 0, n = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initSortedArray(x, n);
        k = sc.nextInt();
        m = binarySearch(x, n, k);
        if(m >= 0) {
            System.out.println((m+1) + "번째");
        } else {
            System.out.println("not exists");
        }
    }
}
