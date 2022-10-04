package com.TrX;

import java.util.Scanner;

public class Day_6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());

        int x = A.compareTo(B);
        if(x>0)
            System.out.println("yes") ;
        else
            System.out.println("No");

        String A_cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B_cap = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(A_cap+" "+B_cap);
    }
}
