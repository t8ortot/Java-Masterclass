package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int numFound = 0;

        for(int i = 1; i <=1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                numFound++;
                System.out.println(i + " is divisible by 3 or 5. " + numFound + " numbers have been found.");

                if (numFound == 5){
                    break;
                }
            }
        }

        System.out.println("Sum is " + sum);
    }
}
