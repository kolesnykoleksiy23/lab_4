package com.ztu.edu.ua.task4;

public enum Category {
    MALE_CLOTHES("Чоловічий одяг"),
    FEMALE_CLOTHES("Жіночий одяг");
    private final String description;

    Category(String description) {
        this.description = description;
    };

    @Override
    public String toString() {
        return this.description;
    }
}
