package com.TrX;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Day_20_ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();

        int [] Arr = new int[n];

        for(int i =0 ; i<Arr.length;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array :");
        System.out.println(Arrays.toString(Arr));
        int [] RevArr = new int[n];
        int j=n-1;
        for(int i =0 ; i<Arr.length ; i++){
            RevArr[i]=Arr[j];
            j-=1;
        }
        System.out.println("Reversed Array :");
        System.out.println(Arrays.toString(RevArr));


    }
}
