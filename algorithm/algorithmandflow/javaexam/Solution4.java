package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//n 까지의 피보나치 수열 구하기
public class Solution4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fibonacci(n);
    }
}
