package org.example.task4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("Java", "C++", "SQL", "Python", "HTML", "Lazarus", "Delphi", "Spring");

        boolean containsLogin1 = col.stream().anyMatch(("login"::equals));
        //or
        boolean containsLogin2 = col.stream()
                .anyMatch(s -> s.contains("login"));

        System.out.println(containsLogin1);
        System.out.println(containsLogin2);

        Optional<String> longestString = col.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("The longest string " + longestString);

        Optional<String> shortestString = col.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("The shortest string " + shortestString);

        col.stream().filter((s -> s.matches("\\w+"))).forEach(System.out::println);

        System.out.println("-----------");

        col.stream().forEach(System.out::println);
    }
}
