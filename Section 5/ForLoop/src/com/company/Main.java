package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% is: " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 3% is: " + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 4% is: " + calculateInterest(10000, 4.0));
        System.out.println("10,000 at 5% is: " + calculateInterest(10000, 5.0));

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello");
        }

        for (int i = 6; i < 9; i++){
            System.out.println("10,000 at " + i + "% is: " + calculateInterest(10000, i));
        }

        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% is: " + calculateInterest(10000, i));
        }


        int counter = 0;
        for (int i = 1; i < 100; i++ ){
            if (isPrime(i)){
                counter++;
                System.out.println(i + " is a prime number. " + counter + " prime numbers found.");
            }

            if (counter >= 10){
                break;
            }
        }

    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest (double amount, double interestRate){
        return amount * interestRate / 100;
    }
}
