package org.example.task3;

import java.net.Inet4Address;
import java.util.Random;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(11);
        };
        System.out.println(supplier.get());
    }

}
