package com.TrX;

import java.math.BigInteger;
import java.util.Scanner;

public class Day_33_BigInteger_HackerRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}

