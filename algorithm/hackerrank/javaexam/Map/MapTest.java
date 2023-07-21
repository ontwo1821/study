

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class MapTest {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> pb = new HashMap<>();
        try {
            int cnt = Integer.parseInt(br.readLine());
            IntStream.range(0, cnt).forEach(i -> {
                try {
                    String key = br.readLine();
                    String val = br.readLine();
                    pb.put(key, val);
                } catch(IOException ioe) {
                    ioe.printStackTrace();
                }
            });
            br.lines().forEach(i -> {
                if(pb.containsKey(i)) {
                    System.out.println(i + "=" + pb.get(i));
                } else {
                    System.out.println("Not found");
                }
            });
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
