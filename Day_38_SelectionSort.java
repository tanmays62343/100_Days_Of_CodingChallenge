package com.TrX;

import java.util.Scanner;

public class Day_38_SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int [] array=new int[10];
        for(int i=0;i<size;i++){
            System.out.println("enter "+i+"th element");
            array[i]=s.nextInt();
        }
        System.out.println("Entered array:-");
        printArray(array,size);
        selectionSort(array,size);
        System.out.println("Sorted Array:-");
        printArray(array,size);
    }
    static void selectionSort(int[] A,int length){
        for(int step=0;step<length-1;step++){
            int minimum=step;
            for(int k=step+1;k<length;k++){
                if(A[k]<A[minimum]){
                    minimum=k;
                }
            }
            int temp=A[minimum];
            A[minimum]=A[step];
            A[step]=temp;
        }
    }
    static void printArray(int [] A,int length){
        for(int i=0;i<length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
