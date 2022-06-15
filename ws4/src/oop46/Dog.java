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
public class Dog extends Mammal{
     public Dog(String name) {
        super(name);
    }

    public Dog() {
        super(null);
    }

  
    public void greeting() {
        System.out.println("Woof");
    }
    public void greeting(Dog dog) {
        System.out.println("Woooof");
    }
            @Override
    public String toString() {
        return "Dog{" + super.toString() + '}';
    }
}
