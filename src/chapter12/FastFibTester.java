package chapter12;

import java.util.Scanner;

public class FastFibTester {

    public static void main(String[] args) {
        int n;
        FastFib fib = new FastFib();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the fibonacci length n: ");
        n = in.nextInt();

        long[] fibList = new long[n];

        double prevTime = System.currentTimeMillis();
        System.out.println(fib.slowFibonacci(n));
        double postTime = System.currentTimeMillis();

        System.out.println("The running time for the slower fibonacci: " + (postTime - prevTime));

        prevTime = System.currentTimeMillis();
        System.out.println(fib.fastFibonacci(n, fibList));
        postTime = System.currentTimeMillis();

        System.out.println("The running time for the faster fibonacci: " + (postTime - prevTime));

    }
}
