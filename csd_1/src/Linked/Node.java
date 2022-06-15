/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked;

/**
 *
 * @author Admin
 */
public class Node {
     Person info;
    Node next;

    public Node() {
    }

    public Node(Person info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(String name, int age) {
        info = new Person(name, age);
        next = null;
    }
    
}
