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
public class Square extends Retangle{

    public Square() {
    }
    public Square(double side) {
   super(side, side);  
}    
    
    public Square(double side,String color,boolean filled) {
   super(side, side,color,filled);  
}    
   
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square ["+super.toString()+"]";
    }
    
}
