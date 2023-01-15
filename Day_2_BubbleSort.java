package com.TrX;

//Program of BubbleSort     #Day2Of100DaysOfCoding

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr1 = {67,54,89,11,56};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr1));
    }
    public static void bubbleSort(int [] arr) {
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
