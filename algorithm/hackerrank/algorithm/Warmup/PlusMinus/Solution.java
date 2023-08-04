package algorithm.Warmup.PlusMinus;

import java.util.List;

public class Solution {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        double positive = 0, negative = 0, zero = 0;

        for(Integer a : arr) {
            if(a > 0) {
                positive++;
            } else if(a < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive / size);
        System.out.println(negative / size);
        System.out.println(zero / size);
    }
}
