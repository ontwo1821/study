package javaexam.fibonacci;

public class Solution {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1, f3 = 0;

        int input = 50;

        while(input > f1) {
            System.out.println(f1);

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
