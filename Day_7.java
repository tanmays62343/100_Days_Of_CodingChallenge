package com.TrX;

//To lexicographically compare two Strings program

import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2 ;
        str1= sc.nextLine();
        str2=sc.nextLine();

        int result = str1.compareTo(str2);

        if(result<0){
            System.out.println(str1+" is less than "+str2);
        }
        else if(result==0){
            System.out.println(str1+" is equal to "+str2);
        }
        else{
            System.out.println(str1+" is greater than "+str2);
        }
    }
}
