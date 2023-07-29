package org.example.task2;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {

        Function<Integer, String> function = num -> {

            if (num % 2 == 0 && num != 0) {
                return "Положительное число";
            }
            if (num % 2 != 0) {
                return "Отрицательное число";
            } else
                return "Ноль";
        };
        System.out.println(function.apply(10));
    }

}
