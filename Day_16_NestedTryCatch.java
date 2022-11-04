package com.TrX;

public class Day_16_NestedTryCatch {

        public static void main(String args[]) {
            try {
                int a[] = {30, 45, 60, 75, 90, 105, 120, 140, 160, 200};
                // displaying element at index 8
                System.out.println("Element at index 8 = "+a[8]);
                // another try block
                try {
                    System.out.println("Division");
                    int res = 100/ 0;
                }
                catch (ArithmeticException ex2) {
                    System.out.println("Sorry! Division by zero isn't feasible!");
                }
            }
            catch (ArrayIndexOutOfBoundsException ex1) {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
}

