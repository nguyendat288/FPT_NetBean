/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testoop;

/**
 *
 * @author Admin
 */
public class Book {
    private String name ;
    private Author author;
    private Double price;
    private int qty=0;

    public Book() {
    }

    public Book(String name, Author author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, double price, int i) {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=i;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
