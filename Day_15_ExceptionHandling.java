package com.TrX;
import java.util.Scanner;

public class Day_15_ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dividend :");
        int a = sc.nextInt();
        System.out.println("Enter the Divisor :");
        int b = sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println("The result is : "+c);
        }
        catch(Exception e){
            System.out.println("Invalid Input :"+e);
        }
        System.out.println("End of the program");
    }
}
