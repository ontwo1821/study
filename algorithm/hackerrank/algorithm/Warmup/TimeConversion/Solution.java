package algorithm.Warmup.TimeConversion;

public class Solution {
    public static String timeConversion(String s) {
        // Write your code here
        String fmt = s.substring(8);
        String result = "";
        if(!s.substring(0, 2).equals("12") && fmt.equals("PM")) {
            result = (Integer.valueOf(s.substring(0, 2)) + 12) + s.substring(2, 8);
        } else if(s.substring(0, 2).equals("12") && fmt.equals("AM")) {
            result = "00" + s.substring(2, 8);
        } else {
            result = s.substring(0, 8);
        }

        return result;
    }
}
