/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

import oop.Circle;

/**
 *
 * @author Admin
 */
public class TestMain {

    
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
      System.out.println(c1);  
      Circle c2 = new Circle(); // default constructor
      System.out.println(c2);

      c1.setRadius(2.2);
      System.out.println(c1);      // toString()
      System.out.println("radius is: " + c1.getRadius());

      // Test getArea() and getCircumference()
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCir());
    }
    
}
