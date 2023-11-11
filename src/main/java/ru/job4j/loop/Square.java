package ru.job4j.loop;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        /* заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат */
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
