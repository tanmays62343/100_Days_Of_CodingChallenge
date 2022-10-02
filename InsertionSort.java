package com.TrX;

// Program of insertionSort      Day3Of100DaysOfCoding

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int [] arr1 = {12,34,1,23,44};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr1));
        insertionSort(arr1);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr1));

    }
    public static void insertionSort (int [] arr){

        for(int j=1;j<arr.length;j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}
