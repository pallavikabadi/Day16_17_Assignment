package com.bridgelabz.DataStructurePrograms.UnOrderedList;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String string = "A lot can happen in a year";
        System.out.println(string);

        String[] wordSplit = string.split(" ");

        System.out.println("Splitting Word = " +Arrays.toString(wordSplit));

        for (int i=0; i< wordSplit.length; i++) {
            linkedList.append(wordSplit[i]);
        }
        while (true) {
            System.out.print("Enter a word to check whether it is present or not : ");
            String word = scanner.next();
            linkedList.search(word);
            linkedList.display();
        }
    }
}






