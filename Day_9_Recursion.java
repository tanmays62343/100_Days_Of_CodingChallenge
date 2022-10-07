package com.TrX;

public class Day_9_Recursion {
// find power of a number through Recursion   Day9_Of100DaysOfCoding
    public static void main(String[] args) {
            var result = powerOfNum(2,3);
            System.out.println("The power is: "+result);
        }
        public static int powerOfNum(int B , int P){
            if(P==0){
                return 1;
            }
            return B *powerOfNum(B ,P-1);
        }
    }

