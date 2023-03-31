package com.bridgelabz.AlgorithmPrograms;

public class PrimeNumbers {
    public static void prime() {

        boolean primeNumber;
        for (int j = 2; j <= 1000; j++) {
            primeNumber = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber)
                System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        prime();
    }
}

