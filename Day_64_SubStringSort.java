package com.TrX;
import java.util.*;
import java.util.Arrays;

public class Day_64_SubStringSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String- ");
        String str = sc.next();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            int check = str.charAt(i);
            if (48 < check && check < 57) {
                System.out.println("Input string can not have digits");
                return;
            }
        }
        str = str.toLowerCase();
        char[] straarr = str.toCharArray();
        Arrays.sort(straarr);
        System.out.println("-------------Substrings------------------- ");
        String newstr = new String(straarr);
        for (int i = 0; i < newstr.length(); i++) {
            for (int j = i; j < newstr.length(); j++) {
                System.out.println(newstr.substring(i, j + 1));
            }
        }

    }

}