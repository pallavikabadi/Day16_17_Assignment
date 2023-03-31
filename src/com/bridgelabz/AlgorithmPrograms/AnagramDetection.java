package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    private void anagram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the String 2 : ");
        String string2 = scanner.nextLine();
//String to Array:
        if (string1.length() == string2.length()) {
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();
//Sorting:
            Arrays.sort(array1);
            Arrays.sort(array2);

            String sortedString1 = new String(array1);

            String sortedString2 = new String(array2);

            if (sortedString1.equals(sortedString2))
                System.out.println("Two Strings are Anagram.");
            else
                System.out.println("Strings are NOT Anagram");
        }
        else
            System.out.println("Not an Anagram");
    }

    public static void main(String[] args) {

        AnagramDetection anagramDetection = new AnagramDetection();
        anagramDetection.anagram();
    }
}
