package javaexam.BitSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int[] init = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = init[0];
            int m = init[1];
            BitSet[] bits = new BitSet[2];
            bits[0] = new BitSet(n);
            bits[1] = new BitSet(n);

            IntStream.range(0, m).forEach(i -> {
                try {
                    String[] cmds = br.readLine().split(" ");
                    String oper = cmds[0];
                    int pos1 = Integer.parseInt(cmds[1]) - 1;
                    int pos2 = Integer.parseInt(cmds[2]) - 1;
                    switch (oper) {
                        case "AND":
                            bits[pos1].and(bits[pos2]);
                            break;
                        case "SET":
                            bits[pos1].set(pos2 + 1);
                            break;
                        case "FLIP":
                            bits[pos1].flip(pos2 + 1);
                            break;
                        case "OR":
                            bits[pos1].or(bits[pos2]);
                            break;
                        case "XOR":
                            bits[pos1].xor(bits[pos2]);
                            break;
                    }
                    System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
                } catch (IOException ioe) {
                    throw new RuntimeException(ioe);
                }
            });

            br.close();

        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }

    }
}
