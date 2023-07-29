package org.example.task9;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Task9 {
    public static void main(String[] args) {
        int n = 24;
        Optional<Integer> opt = getFirst(n);

        opt.ifPresentOrElse(result -> System.out.println("'i' is greater than 'n'!"),
                () -> System.out.println("'i' isn't greater than 'n'!"));

//        if (opt.isPresent()) {
//            System.out.println("'i' is greater than 'n'!");
//        } else
//            System.out.println("'i' isn't greater than 'n'!");
    }

    public static Optional<Integer> getFirst(int n) {
        return IntStream.iterate(2, i -> i * 2 <= n, i -> i + 2)
                .limit(6)
                .filter(i -> i > 10)
                .boxed()
                .findFirst();
    }

}