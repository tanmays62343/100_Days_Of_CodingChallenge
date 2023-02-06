package com.TrX;

import java.util.*;

public class Day_73_RemoveJunkCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        sc.close();
        s = s.replaceAll("[^a-zA-Z0-9 /s]","");
        System.out.println("New String After Removing : \n"+s);
    }
}