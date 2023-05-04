import java.util.Arrays;
import java.util.Comparator;

public class MinMake {
    public static void main(String[] args){
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(solution(a, b));
    }

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i<A.length;i++){
            answer += A[i] * B[B.length-(i+1)];
        }

//        PriorityQueue<Integer> lowest = new PriorityQueue<>();
//        PriorityQueue<Integer> highest = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int i = 0; i<A.length; i++) {
//            lowest.add(A[i]);
//            highest.add(B[i]);
//        }
//
//        while(!lowest.isEmpty()) {
//            answer += lowest.poll() * highest.poll();
//        }

        return answer;
    }
}
