package com.ztu.edu.ua.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Check {
    private final String time;
    private final float total;
    private LinkedList<Item> items;

    public Check(LinkedList<Item> items) {
        this.items = items;
        total = calculateTotal();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        this.time = LocalDateTime.now().format(formatter);
    }
    public float calculateTotal() {
        return (float) items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }
    public String getTime() {
        return time;
    }
    public float getTotal() {
        return total;
    }
    public LinkedList<Item> getItems() {
        return items;
    }

}
