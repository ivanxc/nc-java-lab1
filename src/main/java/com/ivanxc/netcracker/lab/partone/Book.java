package com.ivanxc.netcracker.lab.partone;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorNames() {
        String names = "";
        for(Author author : authors) {
            // private name, как получить доступ?
            names += author.getName() + ", ";
        }
        return names.substring(0, names.length() - 1);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
            "name='" + name + '\'' +
            ", authors=" + Arrays.toString(authors) +
            ", price=" + price +
            ", qty=" + qty +
            ']';
    }
}
