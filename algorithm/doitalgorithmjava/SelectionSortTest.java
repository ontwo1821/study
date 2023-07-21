import java.util.Scanner;

public class SelectionSortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int A[] = new int[s.length()];
        for (int i = 0; i< s.length(); i++){
            A[i] = Integer.parseInt(s.substring(i,i+1));
        }

        for (int i = 0; i< A.length; i++) {
            int Max = i;
            for (int j=i; j< A.length; j++){
                if(A[Max] < A[j]){
                    Max = j;
                }
            }
            if (A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for (int i = 0; i< A.length; i++) {
            System.out.print(A[i]);
        }

    }
}
