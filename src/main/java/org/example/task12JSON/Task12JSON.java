package org.example.task12JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Task12JSON {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = ClassLoader.getSystemResourceAsStream("person.json")
                .readAllBytes();

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(jsonData, Person.class);
        System.out.println(person);
    }
}
