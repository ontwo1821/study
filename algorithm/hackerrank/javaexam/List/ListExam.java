
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListExam {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int numCnt = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            Stream.of(br.readLine().split(" ")).forEach(o -> {
                list.add(Integer.parseInt(o));
            });
            int cmdCnt = Integer.parseInt(br.readLine());
            IntStream.range(0, cmdCnt).forEach(i -> {
                try {
                    String cmd = br.readLine();
                    int[] cmdArr =
                            Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    if(cmd.equals("Insert")) {
                        list.add(cmdArr[0], cmdArr[1]);
                    } else if(cmd.equals("Delete")) {
                        list.remove(cmdArr[0]);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.print(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            br.close();
        } catch(IOException ioe) {
            throw new RuntimeException(ioe);
        }

    }
}
