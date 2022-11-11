package com.TrX;

import java.util.Scanner;

public class Animal {

    void action() {
        System.out.println("Voice");
    }


    public static void main(String[] args) {

        Animal a = new Dog();
        Scanner sc = new Scanner(System.in);


        a.action();

    }
}