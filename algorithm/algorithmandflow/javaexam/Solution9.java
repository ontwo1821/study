package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//최대 공약수 구하기
public class Solution9 {
    public static void main(String[] args) {
        int m = 0, n = 0, gcd = 0;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        gcd = euclideanGCD(m, n);
        System.out.println(gcd);
    }
}
