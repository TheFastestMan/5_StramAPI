package org.example.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {

        List<Person> groupOfPeople = groupGenerator();

        List<String> surNameList = groupOfPeople.stream()
                .filter(person -> person.getAge() < 21)
                .peek(person -> System.out.println("Person: " + person))
                .sorted(Comparator.comparing(Person::getSurName)
                        .thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurName)
                .collect(Collectors.toList());

        System.out.println("Sorted group of 4 people: " + surNameList);
    }

    public static List<Person> groupGenerator() {
        Random random = new Random();

        List<Person> group = new ArrayList<>();
        String[] nameArr = {"Ivan", "Igor", "Oleg", "Ali", "Alena", "Oly"};
        String[] surNameArr = {"Ivanov", "Drago", "Gagarin", "Obama", "Trump", "Petrov"};


        for (int i = 0; i < 100; i++) {
            group.add(new Person(nameArr[random.nextInt(5)],
                    surNameArr[random.nextInt(5)], random.nextInt(16) + 15));
        }

        return group;
    }

}
