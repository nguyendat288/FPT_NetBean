/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop61;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
protected double width=1.0;
protected double length=1.0;

    public Rectangle(double width, double length, String name, boolean filled) {
        super(name, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
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
    double getArea() {
      return this.width*this.length;  
    }

    @Override
    double getPerimeter() {
return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +super.toString()+ "width=" + width + ", length=" + length + '}';
    }
    
}
