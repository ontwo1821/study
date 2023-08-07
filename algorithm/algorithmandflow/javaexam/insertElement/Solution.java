package javaexam.insertElement;

import java.util.Arrays;

public class Solution {

    public static Integer[] insertElement(Integer[] arr, int element) {
        int len = arr.length;
        int newLen = len + 1;

        int pos = len - 1;
        int newPos = len;

        boolean insertFlag = false;
        Integer[] newArr = new Integer[newLen];

        while(newPos >= 0) {
            if(pos < 0) {
                newArr[newPos] = element;
            } else {
                Integer compare = arr[pos];
                if(!insertFlag && (element > compare)) {
                    newArr[newPos] = element;
                    insertFlag = true;
                } else {
                    newArr[newPos] = compare;
                    pos--;
                }
            }
            newPos--;
        }

        return newArr;
    }

    public static void main(String[] args) {
        Integer[] arr = {17, 23, 33};
        Arrays.stream(insertElement(arr, 18)).forEach(System.out::println);
    }
}
