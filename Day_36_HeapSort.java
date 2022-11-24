package com.TrX;

import java.util.Scanner;

public class Day_36_HeapSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=s.nextInt();
        int [] array= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter "+i+"th element");
            array[i]=s.nextInt();
        }
        printArra(array,size);
        heapsort(array,size);
        System.out.println("Sorted array");
        printArra(array,size);
    }
    static void heapsort(int [] A,int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(A,n,i);
        }
        for(int j=n-1;j>=0;j--){
            int temp=A[0];
            A[0]=A[j];
            A[j]=temp;
            heapify(A,j,0);
        }
    }
    static void heapify(int [] a,int n,int i){
        int largest=i;
        int left =2*i+1;
        int right=2*i+2;
        if(left<n && a[left]>a[largest]){
            largest=left;
        }
        if(right<n && a[right]>a[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }
    }
    static void printArra(int [] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
