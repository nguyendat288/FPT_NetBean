package oop3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Rectangle {
    private float length ;
    private float width ;

   
    public Rectangle() {
        length =(float) 1.0;
        width=(float) 1.0;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public String toString() {
        return "Rectangle[" + "length=" + length + ", width=" + width + ']';
    }
    public double getArea(){
        return width*length;
    }
    public double getPer(){
        return (width+length)*2;
    }
    
}
