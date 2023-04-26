import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RangeSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sNo = Integer.parseInt(st.nextToken());
        int qNo = Integer.parseInt(st.nextToken());

        long[] sum = new long[sNo+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= sNo; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }


        for (int q = 0; q < qNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.print(sum[j] - sum[i-1]);
        }






    }
}
