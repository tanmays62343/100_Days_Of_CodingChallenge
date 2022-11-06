package com.TrX;

import java.util.Arrays;

public class Day_18_ArrayInsertion {

    public static int [] arr = null;

    public static void main(String[] args) {
        ArrayCreation(10);
        ArrayInsertion(0,22);
        ArrayInsertion(1,12);
        ArrayInsertion(1,133);
        ArrayInsertion(34,99);
    }

    public static void ArrayCreation(int sizeOfArray){
        arr = new int [sizeOfArray];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }
    public static void ArrayInsertion(int location ,int Data){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=Data;
                System.out.println("Successfully Inserted");
            }
            else{
                System.out.println("This cell is already occupied !!");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Location");
        }
    }

}
