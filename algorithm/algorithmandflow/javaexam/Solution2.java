package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//순서에 맞게 삽입하기
public class Solution2 {
    public static void main(String[] args) {
        int n = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] x = new int[n];

        initSortedArray(x, n - 1);
        k = sc.nextInt();
        insertElement(x, n - 2, k);
        printArray(x, n);
    }
}
