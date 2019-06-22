package com.fherdelpino.musicnotes;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<Long, Long> fibonacciNumbers = new HashMap<>();
    long count = 0;

    public static void main(String[] args) {
        fibonacciNumbers.put(1L, 0L);
        fibonacciNumbers.put(2L, 1L);
        new Main().run();
    }

    public void run() {
        long time = System.currentTimeMillis();

        for (int i = 1; i <= 50; i++) {
            time = System.currentTimeMillis();
            System.out.printf("%d: %d, time = %dms, counts=%d%n", i, fibo(i), System.currentTimeMillis() - time, count);
            count = 0;
        }
//        int n = 4;
//        System.out.printf("%d: %d, time = %dms%n", n, fibo(n), System.currentTimeMillis() - time);
//        System.out.println(count);

    }

    public long fibo(long n) {
        count++;
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        return fibo(n - 1) + fibo(n - 2);

    }

    public long fibo2(long n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        long previous = 0, next = 1, result = 0;

        for (int i = 0; i < n - 2; i++) {
            result = next + previous;
            previous = next;
            next = result;
        }

        return result;
    }

    public long fibo3(long n) {
        System.out.println(++count);
        Long result = fibonacciNumbers.get(n);

        if (result != null)
            return result;

        result = fibo3(n - 1) + fibo3(n - 2);

        fibonacciNumbers.put(n, result);

        return result;
    }
}
