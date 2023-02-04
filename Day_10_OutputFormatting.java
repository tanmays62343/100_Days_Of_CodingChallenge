package com.TrX;

import java.util.Scanner;

public class Day_10_OutputFormatting {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if(x<10){
                    System.out.printf("%-15s00%d",s1,x);
                }
                else if(x<100){
                    System.out.printf("%-15s0%d",s1,x);
                }
                else{
                    System.out.printf("%-15s%d",s1,x);
                }
                System.out.println();
            }
            System.out.println("================================");
        }
    }


