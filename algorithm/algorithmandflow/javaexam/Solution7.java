package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//가장 작은 숫자 찾기
public class Solution7 {
    public static void main(String[] args) {
        int n = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        min = findMinimum(x, 0, n);
        System.out.print(min);
    }
}
