package javaexam.sieveofEratosthenes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int num = 20;

        boolean[] sieves = new boolean[num];
        Arrays.fill(sieves, true);

        for(int i = 2; i < Math.sqrt(num); i++) {
            if(sieves[i]) {
                for(int j = (i*i); j < num; j = j+i) {
                    sieves[j] = false;
                }
            }
        }
        int sum = 0;
        for(int i = 2; i< sieves.length; i++) {
            if(sieves[i]) System.out.println(i);
        }


    }
}
