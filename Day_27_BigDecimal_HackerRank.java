package com.TrX;

import java.math.BigDecimal;
import java.util.*;

class Day_27_BigDecimal_HackerRank {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Comparator myComparator = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                BigDecimal a = new BigDecimal(String.valueOf(o1));
                BigDecimal b = new BigDecimal(String.valueOf(o2));
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,myComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}