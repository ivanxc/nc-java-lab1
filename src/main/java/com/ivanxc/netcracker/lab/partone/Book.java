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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && qty == book.qty
            && name.equals(book.name) && Arrays.equals(authors,
            book.authors);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(price);
        result = 31 * result + Integer.hashCode(qty);
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        return result;
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
