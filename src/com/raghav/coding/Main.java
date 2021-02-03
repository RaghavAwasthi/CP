package com.raghav.coding;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        long N;
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {

        }
    }

    public static  void generator()
    {
        while(true)
        {
            int N= (int) Math.random();
            int K= (int) Math.random();
        }
    }

    public static long tester(int N, int K, long arr[]) {
        long forwardK = 0;

        long backwardK = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < K; i++) {
            forwardK += arr[i];
        }

        for (int i = arr.length - 1; i >= arr.length - K; i--) {
            backwardK += arr[i];
        }
        return Math.max(Math.abs(sum - 2 * forwardK), Math.abs(sum - 2 * backwardK));

    }

    public static long solve(int N, int K, long arr[]) {

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        long ch = 0;
        for (int i = 0; i < K; i++) {
            ch += arr[i];
        }
        return (sum - ch - ch);
    }
}
