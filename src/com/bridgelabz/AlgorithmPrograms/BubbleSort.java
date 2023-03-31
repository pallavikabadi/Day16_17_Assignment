package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int array[]= {6,8,5,9,2};
        System.out.println("Array before Sorting : " + Arrays.toString(array));
        int n = array.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Array After Sorting : " +Arrays.toString(array));
    }
}
