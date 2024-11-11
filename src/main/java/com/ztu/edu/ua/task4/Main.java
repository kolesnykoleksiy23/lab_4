package com.ztu.edu.ua.task4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("Джинси", Category.FEMALE_CLOTHES, 1500.78f));
        items.add(new Item("Спідниця", Category.FEMALE_CLOTHES, 1000.56f));
        items.add(new Item("Краватка", Category.MALE_CLOTHES, 500.78f));
        items.add(new Item("Штани", Category.MALE_CLOTHES, 50.88f));
        items.add(new Item("Кросівки", Category.MALE_CLOTHES, 1500.88f));
        items.add(new Item("Сукня", Category.FEMALE_CLOTHES, 2000.34f));
        items.add(new Item("Футболка", Category.MALE_CLOTHES, 350.90f));
        items.add(new Item("Пальто", Category.FEMALE_CLOTHES, 3000.50f));
        items.add(new Item("Шапка", Category.MALE_CLOTHES, 300.00f));
        items.add(new Item("Блузка", Category.FEMALE_CLOTHES, 700.44f));


        Check check = new Check(items);
        Printer.printCheck(check);
    }
}
