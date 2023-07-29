package org.example.task10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> optional = numbers.stream()
                .reduce((acc, b) -> acc + b);

        optional.ifPresentOrElse(result -> System.out.println(optional.get()),
                () -> System.out.println("There is no anything!"));

    }

}
