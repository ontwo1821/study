import java.util.Scanner;

public class sum {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int sum = 0;

        for(int i = 0; i < c.length; i++) {
            sum += c[i] - '0';
        }

        System.out.println(sum);


    }
}
