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
public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    BigDog() {
    }
   
      @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooooow");
    }
}
