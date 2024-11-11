package com.ztu.edu.ua.task5;

public class Item {
    private String itemName;
    private Category category;
    private float price;

    public Item(String itemName, Category category, float price) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
