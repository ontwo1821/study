import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TowPointerJoomong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] material = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i =0; i< N; i++) {
            material[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(material);
        int i = 0;
        int j = N -1;
        int count = 0;
        while (i < j) {
            int hap = material[i] +material[j];
            if (hap < M) {
                i++;
            } else if (hap > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
