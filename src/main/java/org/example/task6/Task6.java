package org.example.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        int minVal = 1;
        int maxVal = 100;
        int iteration = 10;

        List<Integer> listOfRandomNumber = listGenerator(minVal, maxVal, iteration);

        dividedByTheeAndFive(listOfRandomNumber);

    }
    public static List<Integer> listGenerator(int minVal, int maxVal, int iteration) {
        Random random = new Random();
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < iteration; i++) {
            numberList.add(random.nextInt(maxVal - minVal));
        }
        return numberList;
    }

    public static boolean dividedByTheeAndFive(List<Integer> list) {
        return list.stream()
                .anyMatch((num) -> num % 3 == 0 && num % 5 == 0);
    }

}
