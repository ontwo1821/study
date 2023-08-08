package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//가장 큰 숫자를 마지막으로 보내기
public class Solution8 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        maximumToLast(x, n);
        printArray(x, n);
    }
}
