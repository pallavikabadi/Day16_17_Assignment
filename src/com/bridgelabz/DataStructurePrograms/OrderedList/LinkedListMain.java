package com.bridgelabz.DataStructurePrograms.OrderedList;

import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        System.out.println("Enter the number of Elements :- ");
        int number = sc.nextInt();

        for(int i=0;i<number;i++) {
            System.out.println("Enter the list of numbers : ");
            int list  = sc.nextInt();
            sortedLinkedList.append(list);
        }

        System.out.println("Original linked list");
        sortedLinkedList.display();
        System.out.println();
        System.out.println("Sorted linked list");
        sortedLinkedList.sort();
        sortedLinkedList.display();

        while(true){
            System.out.println();
            System.out.print("Enter a number to check weather it is present or not:-");
            int num = sc.nextInt();
            sortedLinkedList.search(num);
            sortedLinkedList.display();
        }
    }
}






