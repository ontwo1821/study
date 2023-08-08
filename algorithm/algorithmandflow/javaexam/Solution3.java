package javaexam;

import java.util.Scanner;

import static javaexam.Common.*;

//n까지의 합 구하기
public class Solution3 {
    public static void main(String[] args) {
        int m = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sumOfNumbers(n);
        System.out.print(m);
    }
}
