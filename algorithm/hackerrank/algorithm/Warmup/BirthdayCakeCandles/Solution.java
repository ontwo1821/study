package algorithm.Warmup.BirthdayCakeCandles;

public class Solution {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Collections.max(candles);
        int result = 0;
        for(int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == max) result++;
        }

        return result;
    }
}
