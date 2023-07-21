package javaexam.Generics;

public class Solution {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        String[] strArr = {"Hello", "World"};

        printArray(intArr);
        printArray(strArr);
    }

    private static <E> void printArray(E[] array) {
        for(E element : array) {
            System.out.println(element);
        }
    }
}
