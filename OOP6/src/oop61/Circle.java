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
public class Circle extends Shape{
protected  double radius;

    public Circle(double radius, String name, boolean filled) {
        super(name, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +super.toString()+ "radius=" + radius + '}';
    }

    public Circle() {
    }

    @Override
    double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    double getPerimeter() {
return 2*this.radius*Math.PI;
    }

   
}
