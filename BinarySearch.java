package com.TrX;

//Program on BinarySearch  #Day1of100DaysOfCoding
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 7, 8, 9};
        int key = 15;
        int last = arr1.length - 1;
        binarySearch(arr1, 0, last, key);
    }
    public static void binarySearch(int[] arr, int first, int last, int key) {
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid]==key){
                System.out.println("Element found at index :"+mid);
                break;
            }
            else if(arr[mid]<key){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not Found");
        }
    }
}
