/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop46;

/**
 *
 * @author Admin
 */
public class TestMain {
    public static void main(String[] args)
    {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        System.out.println(cat1.toString());
        System.out.println(dog1.toString());
      
    }

}
