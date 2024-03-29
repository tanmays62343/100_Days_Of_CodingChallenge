package com.TrX;

import java.util.*;

public class Day_69_Segregate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter only zeroes or one's as elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(true){
            if(i>=j)
                break;
            if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.println("After Segregation");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}