package com.TrX;

import java.util.Arrays;

public class Day_21_JaggedArrayInsertion {

    int [][] arr;

    public static void main(String[] args) {

        Day_21_JaggedArrayInsertion sda = new Day_21_JaggedArrayInsertion(3,3);
        sda.InsertInArray(0,0,10);
        sda.InsertInArray(0,1,20);
        sda.InsertInArray(0,2,30);
        sda.InsertInArray(0,10,30);
        System.out.println(Arrays.deepToString(sda.arr));

    }

    public Day_21_JaggedArrayInsertion (int NumberOfRows , int NumberOfColumns){
        this.arr = new int [NumberOfRows][NumberOfColumns];
        for (int row = 0 ; row < arr.length;row++){
            for(int col=0 ; col<arr[0].length;col++){
                arr[row][col]=Integer.MIN_VALUE;
            }
        }
    }
    public void InsertInArray(int row ,int col,int value){

        try{
            if( arr[row][col] == Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println("Element Inserted Successfully!!");
            }
            else{
                System.out.println("Already Occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D Array");
        }
    }
}
