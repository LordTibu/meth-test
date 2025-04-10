package org.example;

public class Article {
    private String name;
    private String id;
    private double price;

    public Article(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Article: [ID=%s, Nom=%s, Prix=%.2f €]", id, name, price);
    }
}
