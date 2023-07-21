package org.kunin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        try {
            IntStream.range(0, Integer.parseInt(br.readLine())).forEach(i -> {
                try {
                    int[] intArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    List<Integer> intArrayList = new ArrayList<>(intArr[0]);
                    IntStream.range(1, intArr.length).forEach(j -> {
                        intArrayList.add(intArr[j]);
                    });
                    arr.add(intArrayList);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
        } catch(IOException ie) {
            ie.printStackTrace();
        }

        try {
            IntStream.range(0, Integer.parseInt(br.readLine())).forEach(i -> {
                try {
                    int[] q = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                    System.out.println(arr.get(q[0]-1).get(q[1]-1));
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("ERROR!");
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            });
            br.close();
        }catch (IOException ie) {
            ie.printStackTrace();
        }

    }
}
