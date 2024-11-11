package com.ztu.edu.ua.task6;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime labStart = LocalDateTime.of(2024, 11, 11, 16, 30);

        System.out.println("День тижня: " + labStart.getDayOfWeek());
        System.out.println("День у році: " + labStart.getDayOfYear());
        System.out.println("Місяць: " + labStart.getMonth());
        System.out.println("Рік: " + labStart.getYear());
        System.out.println("Година: " + labStart.getHour());
        System.out.println("Хвилина: " + labStart.getMinute());
        System.out.println("Секунда: " + labStart.getSecond());
        System.out.println("Чи є рік високосним: " + Year.of(labStart.getYear()).isLeap());


        LocalDateTime currentDateTime = LocalDateTime.now();

        boolean isAfter = currentDateTime.isAfter(labStart);
        boolean isBefore = currentDateTime.isBefore(labStart);

        System.out.println("Поточний час після початку лабораторної: " + isAfter);
        System.out.println("Поточний час перед початком лабораторної: " + isBefore);

        LocalDateTime modifiedDateTime = labStart.plusDays(2).plusHours(3).minusMinutes(41);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dtf.format(modifiedDateTime);
        System.out.println("Змінена дата та час: " + formattedDateTime);
    }
}
