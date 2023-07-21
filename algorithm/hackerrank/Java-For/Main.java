package org.kunin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.lang.ArrayIndexOutOfBoundsException;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int numU = arr.get(i).get(j);
                int numD = arr.get(i+2).get(j);
                int temp = 0;
                if(numD > 0 && numU > 0) {
                    temp += arr.get(i).get(j);
                    temp += arr.get(i).get(j+1);
                    temp += arr.get(i).get(j+2);
                    temp += arr.get(i+1).get(j+1);
                    temp += arr.get(i+2).get(j);
                    temp += arr.get(i+2).get(j+1);
                    temp += arr.get(i+2).get(j+2);

                    if(max < temp) {
                        max = temp;
                    }
                }
            }
        }

        System.out.print(max);

    }
}