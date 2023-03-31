package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;

public class ModifyPrimeNumber extends PrimeNumbers{
    public static void primePalindrome() {

        boolean prime;
        for (int j = 2; j <= 1000; j++) {
            prime = true;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime && isPalindrome(j))
                System.out.print(j + " ");
        }
    }
    public static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        }
        return false;
    }
    public static int[] count(int n) {
        int[] count = new int[10];
        int temp = n;
        while (temp != 0) {
            int r = temp % 10;
            count[r]++;
            temp = temp / 10;
        }
        return count;
    }
    public static boolean anagram(int n1, int n2) {
        int[] n1count = count(n1);
        int[] n2count = count(n2);
        for (int i = 0; i < n2count.length; i++) {
            if (n1count[i] != n2count[i]) {
                return false;
            }
        }
        return true;
    }

    public static void primeAnagrams() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println();
        boolean prime;
        for (int i = 2; i <= 1000; i++) {
            prime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                array.add(i);
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (anagram(array.get(i), array.get(j))) {
                    System.out.println(array.get(i) + "  " + array.get(j));
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("Prime Numbers between 0 to 1000:-");
        ModifyPrimeNumber.prime();
        System.out.println();
        System.out.println();
        System.out.println("prime numbers between 0 to 1000 palindrome are :-");
        ModifyPrimeNumber.primePalindrome();
        System.out.println();
        System.out.println();
        System.out.println("Prime Number and Anagrams :-");
        ModifyPrimeNumber.primeAnagrams();
        }

}



