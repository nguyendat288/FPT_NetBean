/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author Admin
 */
public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book() {
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return this.author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
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
    public String getAuthors(Author[] author){
        String str="";
   for(int i =0;i<author.length;i++){
    str=str.concat(author[i].toString());
   }
   return str;      
    }
    
    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", author=[ " +getAuthors(author)+"], price=" + price + ", qty=" + qty + ']';
    }


}
