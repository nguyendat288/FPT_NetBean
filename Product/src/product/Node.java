/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

public class Node {
    Product info;
    Node next;

    public Node() {
    }

    public Node(Product info, Node next) {
        this.info = info;
        this.next = next;
    }
    public Node (String name ,double price,int quantity){
        this.info= new Product(name, price, quantity);
        this.next=null;
    }
}
