/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop32;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
// Can also invoke with an array
//Double coeffs = {1.2, 3.4, 5.6, 7.8};
//MyPolynomial p3 = new MyPolynomial(coeffs);
        System.out.println("p1="+p1);
        System.out.println("p2="+p2);
//        System.out.println("p3="+p3);
System.out.println("p1+p2= "+p1.add(p2));
    }
}
