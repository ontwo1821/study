package org.kunin;

import java.util.*;
import java.util.stream.*;
import java.io.*;

public class HashSetExam {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> strSet = new HashSet<>();
        try {
            int cnt = Integer.parseInt(br.readLine());
            IntStream.range(0, cnt).forEach(i -> {
                try {
                    String s = br.readLine();
                    strSet.add(s);
                    System.out.println(strSet.size());
                } catch(IOException ioe) {
                    ioe.printStackTrace();
                }
            });
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
