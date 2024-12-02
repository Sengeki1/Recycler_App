package com.example.recycle_viewer;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getNome() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}
