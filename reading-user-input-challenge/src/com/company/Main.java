package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.println("Enter the number #" + (counter + 1));
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("not a valid number");
            }
        }

        scanner.close();
        System.out.println("Sum of the numbers = " + sum);
    }
}
