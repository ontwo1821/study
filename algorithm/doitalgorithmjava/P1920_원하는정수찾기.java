import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int target = sc.nextInt();
            int start = 0;
            int end = A.length - 1;
            boolean findFlag = false;
            while(start <= end) {
                int midIdx = (start + end) / 2;
                int midVal = A[midIdx];
                if(midVal < target) {
                    start = midIdx + 1;
                } else if(midVal > target) {
                    end = midIdx - 1;
                } else {
                    findFlag = true;
                    break;
                }
            }

            if(findFlag) System.out.println(1);
            else System.out.println(0);
        }
    }
}
