package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        String word1 = "qwq";
        String word2 = "frf";
        System.out.println(isIzomorf(word1, word2));
    }

    public static boolean isIzomorf(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Character> hashMap = new HashMap<>();
        Set set = new HashSet<>();
        for (int i = 0; i < word1.length(); i++) {
            char charWord1 = word1.charAt(i);
            char charWord2 = word2.charAt(i);
            if (hashMap.containsKey(charWord1) && hashMap.get(charWord1) != charWord2) {
                return false;
            }
            if (set.contains(charWord2) && hashMap.get(charWord1) != charWord2) {
                return false;
            }
            hashMap.put(charWord1, charWord2);
            set.add(charWord2);
        }
        return true;
    }
}





