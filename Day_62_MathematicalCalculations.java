package com.TrX;

public class Day_62_MathematicalCalculations {

    public Day_62_MathematicalCalculations u = new Day_62_MathematicalCalculations();

    public static void main(String[] args) {
        Day_62_MathematicalCalculations m = new Day_62_MathematicalCalculations();
        System.out.println(m.Factorial(5));
    }

    public int countDigits(int n){          //Program to count digits of given number
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public boolean isPalindrome(int n){         //Program to check if the number is a Palindrome
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        return (rev==n);
    }
    public int Factorial(int n){            //Program to find Factorial of a number
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public int countTrailingZeros(int n){           //Count trailing zeros in a Factorial
        int res = 0;
        for(int i =5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }
    public int GCD(int a , int b){          //HCF or GCD (Greatest common Divisor)
        if(b==0){
            return a;
        }
        else {
            return GCD(b , a%b);
        }
    }
    public int LCM(int a, int b){           //LCM (Least Common Multiple)
        return (a*b)/u.GCD(a, b);
    }
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}