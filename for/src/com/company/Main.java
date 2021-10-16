package com.company;

public class Main {

    public static void main(String[] args) {
//        for(double i=2; i<=9;i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                System.out.println("Found number = " + i);
            }

            if (counter == 5) break;
        }

        System.out.println("Sum of the numbers: " + sum);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
