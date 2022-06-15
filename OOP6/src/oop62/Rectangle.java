/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop62;

/**
 *
 * @author Admin
 */
public class Rectangle implements GeometricObject{
private double width;
private double length;

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
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

      @Override
   public double getArea() {
      return this.width*this.length;  
    }

    @Override
  public double getPerimeter() {
return (this.length+this.width)*2;
    }
}
