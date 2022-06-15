/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
    
Colony obj1 = new BeeColony(2000,"honey","land");
        System.out.println(obj1);
        obj1.grow();
        obj1. reproduce();

        University obj2=new FPTUniversity(100000,"FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
  
    }
}
