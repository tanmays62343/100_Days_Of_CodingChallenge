package com.TrX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day_13_ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> rowMap = new HashMap<>();
        Map<Integer, Set<Integer>> colMap = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rowMap.put(i, new HashSet<>());
            colMap.put(i, new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int num = ch - '0';
                    Set<Integer> rowSet = rowMap.get(i);
                    if (!rowSet.add(num)) {
                        return false;
                    }

                    Set<Integer> colSet = colMap.get(j);
                    if (!colSet.add(num)) {
                        return false;
                    }
                }
            }
        }

        for (int subIdx = 0; subIdx < 9; subIdx++) {
            int subRow = 3 * (subIdx / 3);
            int subCol = 3 * (subIdx % 3);
            Set<Integer> grpSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char ch = board[subRow + i][subCol + j];
                    if (ch != '.') {
                        int num = ch - '0';
                        if (!grpSet.add(num)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
