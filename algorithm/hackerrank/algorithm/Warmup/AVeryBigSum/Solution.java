package algorithm.Warmup.AVeryBigSum;

import java.util.List;

public class Solution {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0L;
        for(Long a : ar) {
            result += a.longValue();
        }
        return result;
    }
}
