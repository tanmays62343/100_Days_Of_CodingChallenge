package com.TrX;

import java.util.*;
public class Day_78_nHandShakes {
    static int handshake(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 0;
        int ways=0;
        for(int i=2;i<n+1;i++){
            ways += handshake(i-2) * handshake(n-i);
        }
        return ways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter even number of people sitting - ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(n+" people will handshake "+handshake(n)+" times.");
    }
}
//Sample Output-
// Enter even number of people sitting-
// 14
// 14 people will handshake 429 times.