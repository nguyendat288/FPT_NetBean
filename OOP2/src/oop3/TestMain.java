/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author Admin
 */
public class TestMain {
    public static void main(String[] args) {
          Rectangle r1 = new Rectangle(1.2f, 3.4f);
      System.out.println(r1);  // toString()
      Rectangle r2 = new Rectangle();  // default constructor
      System.out.println(r2);      
      r1.setLength(5.6f);
      r1.setWidth(7.8f);
      System.out.println(r1);  // toString()
      System.out.println("length is: " + r1.getLength());
      System.out.println("width is: " + r1.getWidth());

      // Test getArea() and getPerimeter()
      System.out.printf("area is: %.2f%n", r1.getArea());
      System.out.printf("perimeter is: %.2f%n", r1.getPer());
    }
}
