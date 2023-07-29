package org.example.task13JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task13JSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        ListColor listColor = objectMapper.readValue(
                new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core" +
                        "/5_StramAPI/StreamAPI/src/main/resources/colors.json"), ListColor.class);

        Scanner scanner = new Scanner(System.in);

        Integer idColor = null;
        try {
            System.out.print("Введите идентификатор цвета: ");
            idColor = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Некорректный ввод идентификатора цвета.");
            System.exit(1);
        }

        String colorText = "";
        String colorCode = "";
        for (ColorData colorData : listColor.getColors()) {
            if (colorData.getId() == idColor) {
                colorText = colorData.getColor();
                colorCode = colorData.getValue();
                break;
            }
        }

        String colorEscape = getColor(colorCode);

        if (getColor(colorCode).equals("Нет такого цвета!")) {
            System.out.println(colorEscape);
            System.out.println("Введите другой номер идентификатора цвета!");
        } else
            System.out.println(colorEscape + "Мой любимый цвет - " + colorText + "\u001B[0m");
    }

    public static String getColor(String colorCode) {

        switch (colorCode) {
            case "#f00":
                return "\u001B[31m"; //red
            case "#0f0":
                return "\u001B[32m"; //  green
            case "#00f":
                return "\u001B[36m";// blue
            case "#0ff":
                return "\u001B[34m"; //cyan
            case "#f0f":
                return "\u001B[35m"; //magenta
            case "#ff0":
                return "\u001B[33m"; //yellow
            case "#000":
                return "\u001B[30m";//black
            default:
                return "Нет такого цвета!";
        }
    }

}

