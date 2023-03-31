package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number, N = ");
        int n = scanner.nextInt();
        int low = 0;
        int high = n-1;
        int guessCount = 0;
        int guess = 0;

        System.out.println("Think of a Number Between 0 and " + (n - 1) + ".");

        while (low <= high) {
            guess = (low + high) / 2;
            System.out.println("Is your Number between " + low + " and " + guess + " (y/n): ");
            String response = scanner.next();
            guessCount++;

            if (response == "y") {
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
            System.out.println("The Final Number is " + guess);
            System.out.println("Number of guesses: " + guessCount);
        }
    }



