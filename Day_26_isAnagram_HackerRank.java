package com.TrX;
import java.util.Scanner;

public class Day_26_isAnagram_HackerRank {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String newA = a.toLowerCase();
        String newB = b.toLowerCase();

        char[] aChars = newA.toCharArray();
        char[] bChars = newB.toCharArray();

        java.util.Arrays.sort(aChars);
        java.util.Arrays.sort(bChars);

        return new String(aChars).equals(new String(bChars));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
