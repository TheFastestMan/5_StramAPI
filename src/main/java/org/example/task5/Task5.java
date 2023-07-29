package org.example.task5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {

        int start = 1;
        int end = 20;

        int sumInInches = IntStream.rangeClosed(start, end)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("Длина в дюймах: " + i))
                .map(Task5::inchesToCentimeters)
                .peek(i -> System.out.println("Длина в сантиметрах: " + i))
                .sum();

        System.out.println("Сумма в сантиметрах: " + sumInInches);
    }

    private static int inchesToCentimeters(int inches) {
        final double CENTIMETERS_PER_INCH = 2.54;
        return (int) (inches * CENTIMETERS_PER_INCH);
    }

}
