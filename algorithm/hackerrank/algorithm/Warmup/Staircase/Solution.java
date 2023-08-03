package algorithm.Warmup.Staircase;

public class Solution {
    public static void staircase(int n) {
        // Write your code here
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j <= i; j++){
                sb.append('#');
            }
            System.out.printf("%" + n + "s %n", sb.toString());

        }
    }
}
