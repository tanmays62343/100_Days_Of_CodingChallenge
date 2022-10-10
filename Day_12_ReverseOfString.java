package com.TrX;

import java.util.Scanner;

//Program to Reverse a String   Day12Of100

public class Day_12_ReverseOfString {
        public static char ch;
        public static String Rev="";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your String");
            String str = sc.nextLine();
            System.out.println(reverse(str));
        }
        public static String reverse(String S){
            for(int i =0 ; i<S.length();i++){
                ch= S.charAt(i);
                Rev =ch + Rev ;
            }
            return Rev;
        }
    }

