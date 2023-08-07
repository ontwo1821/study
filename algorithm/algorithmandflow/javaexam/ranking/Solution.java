package javaexam.ranking;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    static void compareElement(int[] xArr, int[] rArr, int n, int k){
        for(int i = 0; i < n; i++) {
            if(xArr[i] < k) {
                rArr[i]++;
            }
        }
    }

    static void ranking(int[] xArr, int[] rArr, int n) {
        for(int i = 0; i < n; i++){
            compareElement(xArr, rArr, n, xArr[i]);
        }
    }

    public static void main(String[] args) {
        int[] xArr = IntStream.of(23, 25, 41, 33).toArray();
        int[] rArr = new int[4];

//        compareElement(xArr, rArr, xArr.length, 30);
        ranking(xArr, rArr, xArr.length);
        Arrays.stream(rArr).forEach(System.out::println);
    }
}
