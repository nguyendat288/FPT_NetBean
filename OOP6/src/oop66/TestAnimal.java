/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop66;

/**
 *
 * @author Admin
 */
public class TestAnimal {
     public static void main(String[] args) {
      // Using the subclasses
      Cat cat1 = new Cat();
      cat1.greets();
      Dog dog1 = new Dog();
      dog1.greets();
      BigDog bigDog1 = new BigDog();
      bigDog1.greets();
       
      // Using Polymorphism
      Animal animal1 = new Cat();
      animal1.greets();
      Animal animal2 = new Dog();
      animal2.greets();
      Animal animal3 = new BigDog();
      animal3.greets();
//      Animal animal4 = new Animal();
      
      // Downcast
      Dog dog2 = (Dog)animal2;
      BigDog bigDog2 = (BigDog)animal3;
      Dog dog3 = (Dog)animal3;
      dog2.greets(dog3);
      dog3.greets(dog2);
      dog2.greets(bigDog2);
      bigDog2.greets(dog2);
      bigDog2.greets(bigDog1);
   }
}
