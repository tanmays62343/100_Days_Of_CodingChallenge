package com.TrX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_40_ExceptionHandling_HackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int result=0;
            result = x/y;
            System.out.println(result);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}