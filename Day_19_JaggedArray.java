package com.TrX;

import java.util.Arrays;

public class Day_19_JaggedArray {

    public static void main(String[] args) {

        int [][] JaggedArr = new int[2][2];
        JaggedArr [0][0] = 1;
        JaggedArr [0][1] = 2;
        JaggedArr [1][0] = 3;
        JaggedArr [1][1] = 4;

        System.out.println(Arrays.deepToString(JaggedArr));

    }
}
