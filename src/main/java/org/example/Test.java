package org.example;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(isIzomorph("qwee", "errt"));

    }

    public static boolean isIzomorph(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character,Character> hashMap = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {

            char wordCharKey1 = word1.charAt(i);
            char wordCharKey2 = word2.charAt(i);

            char wordCharVal1 = word1.charAt(i);
            char wordCharVal2 = word2.charAt(i);

            hashMap.put(wordCharKey1, wordCharVal2);
            hashMap.put(wordCharKey2, wordCharVal1);
        }

        System.out.println(hashMap);

        return true;

    }
}


