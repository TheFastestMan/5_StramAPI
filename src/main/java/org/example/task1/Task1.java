package org.example.task1;

import java.util.function.Predicate;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {

        Predicate<String> nullCheck = str -> str != null;
        Predicate<String> emptyCheck = str -> str.isEmpty();
        Predicate<String> strChecker = str -> {

            String firstLetter = str.substring(0, 1);
            String lastLetter = str.substring(str.length() - 1);
            return (firstLetter.equalsIgnoreCase("J") || firstLetter.equalsIgnoreCase("N"))
                    && lastLetter.equalsIgnoreCase("A");
        };

        String str1 = "Hello world";
        String str2 = "";
        String str3 = "Java";

        out.println(nullCheck.test(str1));
        out.println(emptyCheck.test(str2));
        out.println(strChecker.test(str3));
    }

}
