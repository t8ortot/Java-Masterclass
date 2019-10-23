package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of 125 (1 + 2 + 5) = " + sumDigits(125));
        System.out.println("Sum of -125 (invalid) = " + sumDigits(-125));
        System.out.println("Sum of 4 (invalid) = " + sumDigits(4));
        System.out.println("Sum of 32123 (3 + 2 + 1 + 2 + 3) = " + sumDigits(321233));
    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }


        int total = 0;
        int n = number;
        while (number != 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}
