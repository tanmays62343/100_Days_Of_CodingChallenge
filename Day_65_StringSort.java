package com.TrX;
import java.util.Scanner;

public class Day_65_StringSort {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to sort-");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        char temp;
        sc.close();
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println("Sorted String-");
        System.out.println(arr);
    }
}