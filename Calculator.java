package com.TrX;

public class Calculator {

    public static double num1,num2;

    public Calculator(double num1,double num2) {
        Calculator.num1 =num1;
        Calculator.num2=num2;
    }

    public static double addition(){
        return num1+num2;
    }
    public static double substraction(){
        return num1-num2;
    }
    public static double multiplication(){
        return num1*num2;
    }
    public static double division(){
        return num1/num2;
    }

}
