package javaexam.SelectionSort;

public class Solution {
    static void initRandomArray(int[] x, int n) {
        for(int i = 0; i < n; i++){
            x[i] = (int) (Math.random() * (99 - 10)) + 10;
        }
    }

    static void printArray(int[] x, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(x[i] + " , ");
        }
    }

    public static void main(String[] args) {
        int[] x = new int[10];
        initRandomArray(x, 10);
        printArray(x, 10);
    }
}
