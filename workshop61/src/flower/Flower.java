/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flower;

/**
 *
 * @author Admin
 */
public class Flower {
//    Name, Price, Color and properly methods. 
    String name ;
    int price;
    String color;

    public Flower() {
    }

    public Flower(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Flower{" + "name=" + name + ", price=" + price + ", color=" + color + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
