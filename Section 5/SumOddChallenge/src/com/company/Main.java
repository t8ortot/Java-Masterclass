package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isOdd(int num){
        if (num < 0){
            return false;
        }

        return num % 2 != 0;
    }

    public static int sumOdd (int start, int end){
        if (start > end || start <= 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }

        return sum;
    }
}
