package com.TrX;

import java.util.*;

class JavaMap{
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hashmaping = new HashMap<>();
        sc.nextLine(); //InputMismatchException error will come because need to tell java about next inputs to be string.
        for(int i=1; i<=n; i++) {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            hashmaping.put(name, phone);
            sc.nextLine();
        }
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            if(hashmaping.containsKey(s)) {//containskey is used to match with string
                System.out.println(s+"="+hashmaping.get(s)); // get() returns the object that contains the value associated with the key.
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();

    }
}