package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//n개의 데이터 합 구하기
public class Solution1 {

    public static void main(String[] args) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        initRandomArray(x, n);
        m = sumOfArray(x, n);
        System.out.println(m);
    }
}
