/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Admin
 */
public class LinkedList {

    public static void main(String[] args) {
        MyList list = new MyList();
        System.out.println("Add : ");
        list.add("Cake",10,20);
        list.add("Bread",5,100);
        list.add("Milk",20,110);
        list.add("Banana",30,40);
        list.add("Ba",20,110);
        list.add("Egg",5,50);
        list.add("Egg1",10,50);
        list.add("Cake",15,30);
        list.traverse();
        System.out.println("Price : ");
        double price = 10;
        list.displayByPrice(price);
//        System.out.println("sort : ");
//        list.sortByName();
        list.traverse();
        System.out.println("Delete : ");
        System.out.println(list.deleteUnderPrice(10));
        list.traverse();
        System.out.println("Move highest ");
        list.moveHighestValue();
        list.traverse();
        double max=list.max();
        System.out.println("Max :");
        System.out.println(max);
    }
}
