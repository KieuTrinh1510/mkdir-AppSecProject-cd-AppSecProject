package com.example;

public class Main {
    public static int sum(int n) {
        if (n < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1 to 5: " + sum(5));
    }
}