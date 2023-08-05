package algorithm.Warmup.MiniMaxSum;

import java.util.Collections;
import java.util.List;

public class Solution {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        Long sum = arr.stream().map(Long::valueOf).reduce(0L, Long::sum);

        System.out.print(sum - arr.get(arr.size() - 1));
        System.out.print(" ");
        System.out.print(sum - arr.get(0));
    }
}
