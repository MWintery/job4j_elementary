package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int index = 1; index < data.length; index++) {
             if (data[index] != data[0]) {
                 return false;
             }
        }
        return true;
    }
}
