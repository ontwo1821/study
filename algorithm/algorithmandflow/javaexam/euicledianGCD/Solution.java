package javaexam.euicledianGCD;

public class Solution {
    public static void main(String[] args) {
        int n1 = 8652, n2 = 2766, temp = 0;

        while(n2 != 0) {
            temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }

        System.out.println(Math.abs(n1));

    }
}
