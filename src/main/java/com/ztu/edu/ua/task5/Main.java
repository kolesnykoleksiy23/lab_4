package com.ztu.edu.ua.task5;

import com.ztu.edu.ua.task5.InternationalPrinter;
import com.ztu.edu.ua.task5.Item;

import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("Джинси", Category.FEMALE_CLOTHES, 1500.78f));
        items.add(new Item("Спідниця", Category.FEMALE_CLOTHES, 1000.56f));
        items.add(new Item("Краватка", Category.MALE_CLOTHES, 500.78f));

        Check check = new Check(items);

        Locale localeUa = new Locale("ua", "UA");
        InternationalPrinter.printCheck(check, localeUa);

        Locale localeEn = new Locale("en", "US");
        InternationalPrinter.printCheck(check, localeEn);

        Locale localeFr = new Locale("fr", "FR");
        InternationalPrinter.printCheck(check, localeFr);
    }
}
