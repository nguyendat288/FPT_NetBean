/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop61;

/**
 *
 * @author Admin
 */
public class Car {
//    1. Create a class Car with data: Name, Price, Production and properly methods. 
    String name;
    int price;
    String production ;

    public Car() {
    }

    public Car(String name, int price, String production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", price=" + price + ", production=" + production + '}';
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

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
    
}
