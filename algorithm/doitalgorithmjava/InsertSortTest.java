import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InsertSortTest {
    public static void main(String[] args) throws Exception {
        int A[] = {42, 32, 24, 60, 40};

        int n = A.length;
        for (int i = 1; i < n; i++){
            int target = A[i];
            int j = i - 1;
            while(j >= 0 && A[j-1] > A[j]) {
                A[i] = A[j];
            }

        }

        for(int i = 0; i < n; i++) {
            System.out.print(A[i]+ ",");
        }

    }
}
