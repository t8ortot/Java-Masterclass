package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(11);
        isPalindrome(-222);

    }

    public static boolean isPalindrome(int number){

        int num = number;

        int reverse = 0;

        while (num != 0){
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        return number == reverse;
    }
}
