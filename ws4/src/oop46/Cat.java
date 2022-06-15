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
public class Cat extends Mammal{
    
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super(null);
    }
  
    public void greeting() {
        System.out.println("Meow");
    }
            @Override
    public String toString() {
        return "Cat{" + super.toString() + '}';
    }
}
