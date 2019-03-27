package chapter12;

import java.util.Scanner;

public class FastFibTester {

    public static void main(String[] args) {
        int n;
        FastFib fib = new FastFib();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the fibonacci length n: ");
        n = in.nextInt();

        long[] numList = new long[n];

        for (int i = 1; i <= n; i++) {

            long f = fib.fibonacci(i, numList);
            System.out.println("fib(" + i + ") = " + f);
        }

    }
}
