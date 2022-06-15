/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop45;

/**
 *
 * @author Admin
 */
public class Retangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{"  + super.toString()+ "width=" + width + ", length=" + length + '}';
    }
public double getArea(){
    return this.width*this.length;
}
   public double getPerimeter(){
       return (this.length+this.width)*2;
   }
}
