package com.ztu.edu.ua.task5;

import com.ztu.edu.ua.task5.Check;

import java.util.Formatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InternationalPrinter {
    public static void printCheck(Check check, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("data", locale);

        StringBuilder checkContent = new StringBuilder();
        Formatter formatter = new Formatter(checkContent);

        formatter.format("%s %s\n", bundle.getString("check.date"), check.getTime());
        formatter.format("===========================================\n");
        formatter.format("%-3s %-10s %-15s %-10s\n", "№", bundle.getString("check.header"), bundle.getString("check.category"), bundle.getString("check.price"));
        formatter.format("===========================================\n");

        String itemsFormatted = IntStream.range(0, check.getItems().size())
                .mapToObj(i -> String.format("%-3d %-10s %-15s %,.2f %s",
                        i + 1,
                        check.getItems().get(i).getItemName(),
                        check.getItems().get(i).getCategory(),
                        check.getItems().get(i).getPrice(),
                        bundle.getString("check.currency")))
                .collect(Collectors.joining("\n"));

        checkContent.append(itemsFormatted).append("\n");

        formatter.format("===========================================\n");
        formatter.format("%s %,.2f %s\n", bundle.getString("check.total"), check.getTotal(), bundle.getString("check.currency"));

        System.out.println(checkContent.toString());

        formatter.close();
    }
}
