package org.example.task7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task7 {
    public static void main(String[] args) {

        int size = 100;
        int min = 1;
        int max = 10;

        Set<String> setOfStringNum = new Random().ints(size, min, max)
                .boxed().filter((s) -> s % 2 == 0)
                .map(Objects::toString)
                .collect(Collectors.toSet());

        System.out.println(setOfStringNum);
    }

}
