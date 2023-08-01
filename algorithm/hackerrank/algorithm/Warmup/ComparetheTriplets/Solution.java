package algorithm.Warmup.ComparetheTriplets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] rating = new int[2];
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                rating[0] += 1;
            } else if(a.get(i) < b.get(i)) {
                rating[1] += 1;
            }
        }
        return Arrays.stream(rating).boxed().collect(Collectors.toList());
    }
}
