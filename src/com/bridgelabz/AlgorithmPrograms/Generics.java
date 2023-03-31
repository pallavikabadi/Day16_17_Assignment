package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;

public class Generics <T>{

    static  <T> void search(T search,T[] array){
        for (T str : array) {
            if(str == search){
                System.out.println(str +" is present");
            }
        }
    }

    static <T extends Comparable <T>>void sorting(T[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i <array.length; i++) {
                if (array[i-1].compareTo(array[i]) > 0) {
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
    }
    static <T>void printArray(T[] array){

        System.out.println("Array = "+Arrays.toString(array));
    }
    public static void main(String[] args) {

        System.out.println(" Original Array :- ");
        String[] stringArray={"fami","evin","ami","viaan"};
        System.out.println("Array = " + Arrays.toString(stringArray));
        System.out.println();
        System.out.println(" Sorted Array :-");
        sorting(stringArray);
        printArray(stringArray);
        System.out.println();
        System.out.println(" Searched Name :- ");
        search("evin",stringArray);
    }
}
