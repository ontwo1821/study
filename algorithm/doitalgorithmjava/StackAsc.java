import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;

public class StackAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i< N; i++) {
            A[i] = sc.nextInt();
        }

        boolean result = true;
        StringBuffer sb = new StringBuffer();
        Stack<Integer> st = new Stack<Integer>();
        int num = 1;
        for (int i = 0; i <A.length; i++) {
            int su = A[i];
            if(su >= num) {
                while(su >= num) {
                    st.push(num++);
                    sb.append("+\n");
                }
                st.pop();
                sb.append("-\n");
            } else {
                int p = st.pop();
                if(p > su) {
                    result = false;
                    System.out.println("NO");
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if(result) {System.out.println(sb.toString());}
    }
}
