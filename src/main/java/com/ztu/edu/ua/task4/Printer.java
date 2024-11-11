package com.ztu.edu.ua.task4;

import java.util.Formatter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Printer {
    public static void printCheck(Check check) {
        StringBuilder checkContent = new StringBuilder();
        Formatter formatter = new Formatter(checkContent);

        formatter.format("Дата та час покупки: %s\n", check.getTime());
        formatter.format("===========================================\n");
        formatter.format("%-3s %-10s %-15s %-10s\n", "№", "Товар", "Категорія", "Ціна");
        formatter.format("===========================================\n");

        String itemsFormatted = IntStream.range(0, check.getItems().size())
                .mapToObj(i -> String.format("%-3d %-10s %-15s %,.2f ₴",
                        i + 1,
                        check.getItems().get(i).getItemName(),
                        check.getItems().get(i).getCategory(),
                        check.getItems().get(i).getPrice()))
                .collect(Collectors.joining("\n"));

        checkContent.append(itemsFormatted).append("\n");

        formatter.format("===========================================\n");
        formatter.format("Разом: %,.2f ₴\n", check.getTotal());

        System.out.println(checkContent.toString());

        formatter.close();
    }
}
