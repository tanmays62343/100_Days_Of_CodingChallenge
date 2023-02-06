package com.TrX;

class Day_66_SingletonClass {
    public String str;
    private static Day_66_SingletonClass INSTANCE;

    private Day_66_SingletonClass() {}

    public static Day_66_SingletonClass getSingleInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized(Day_66_SingletonClass.class) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            INSTANCE = new Day_66_SingletonClass();
            return INSTANCE;
        }
    }
}