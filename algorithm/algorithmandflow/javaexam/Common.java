package javaexam;

public class Common {
    public static int sumOfArray(int[] x, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static int sumOfNumbers(int n) {
        int sum = 0 ;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void markMultiple(int[] x, int i, int n) {
        for (int j = 2 * i; j <= n; j += i) {
            x[j] = 1;
        }

    }

    public static void compareElement(int[] x, int[] r, int n, int k) {
        for(int i = 0; i < n; i++){
            if (x[i] <= k) {
                r[i]++;
            }
        }
    }

    public static void maximumToLast(int[] x, int n) {
        int temp = 0;
        for(int i = 0; i < n; i++){
            if(x[i] > x[i+1]) {
                temp = x[i];
                x[i] = x[i + 1];
                x[i + 1] = temp;
            }
        }
    }

    public static void insertElement(int[] x, int j, int k){
        boolean loopFlag = k < x[j];
        while(loopFlag) {
            x[j+1] = x[j];
            j = j - 1;
            if(j >= 0) {
                loopFlag = k < x[j];
            } else {
                loopFlag = false;
            }
        }
        x[j+1] = k;
    }

    public static void initZeroArray(int[] r, int n) {
        for(int i = 0; i < n; i++) {
            r[i] = 0;
        }
    }

    public static void initRandomArray(int[] x, int n) {
        for(int i = 0; i < n; i++){
            x[i] = (int) (Math.random() * (99 - 10)) + 10;
        }
        printArray(x, n);
    }

    public static void printArray(int[] x, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(x[i] + " , ");
        }
    }

    public static void initSortedArray(int[] x, int n){
        x[0] = (int) (Math.random() * 19);
        for(int i = 1; i < n; i++) {
            x[i] = x[i-1] + (int) (Math.random() * 19);
        }
        printArray(x, n);
    }

    public static void fibonacci(int n) {
        int f1 = 0, f2 = 0, f3 = 0;
        f1 = 1;
        f2 = 1;

        while( f1 < n) {
            System.out.print(f1 + " ");
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }

    public static int findMinimum(int[] x, int s, int n) {
        int min = 0;
        min = s;
        for(int i = s + 1; i < n; i++) {
            if(x[i] < x[min]) {
                min = i;
            }
        }
        return min;
    }

    public static int euclideanGCD(int n1, int n2) {
        int t = 0;
        while(n2 != 0) {
            t = n1 % n2;
            n1 = n2;
            n2 = t;
        }
        return Math.abs(n1);
    }

    public static void sieveOfEratosthenes(int[] x, int n) {
        for(int i = 2; i < Math.sqrt(n); i++) {
            markMultiple(x, i, n);
        }
    }
    public static void printPrimeNumber(int[] x, int n){
        System.out.println(2);
        for(int i = 3; i <= n; i++){
            if(x[i] == 0) System.out.print(i + " , ");
        }
    }
    public static void ranking(int[] x, int[] r, int n) {
        for(int i = 0; i < n; i++){
            compareElement(x, r, n, x[i]);
        }
    }

    public static int sequentialSearch(int[] x, int n, int k) {
        int i = 0, loc = 0;
        while(i < n - 1 && x[i] != k) {
            i++;
        }

        if(x[i] == k) {
            loc = i;
        } else {
            loc = -1;
        }
        return loc;
    }

    public static int binarySearch(int[] x, int n, int k) {
        int loc = 0, l = 0, m = 0, h = 0;
        h = n - 1;
        m = (l + h) / 2;
        while(h > l && x[m]!=k) {
            if(k > x[m]){
                l = m + 1;
            } else {
                h = m - 1;
            }
            m = (l + h) / 2;
        }
        if(x[m] == k) {
            loc = m;
        } else {
            loc = -1;
        }
        return loc;
    }
    public static void selectionSort(int[] x, int n){
        int t = 0, min = 0;
        for(int i = 0; i < n; i++) {
            min = findMinimum(x, i, n);
            t = x[min];
            x[min] = x[i];
            x[i] = t;
        }
    }

    public static void insertionSort(int[] x, int n) {
        for(int i = 1; i < n; i++) {
            insertElement(x, i - 1, x[i]);
        }
    }

    public static void bubbleSort(int[] x, int n) {
        for(int i = 1; i < n; i++){
            maximumToLast(x, n - i);
        }
    }
}
