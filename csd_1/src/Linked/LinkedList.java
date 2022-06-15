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
public class LinkedList {

    public static void main(String[] args) {
        MyList list = new MyList();
        list.addLast("Aa", 20);
        list.addLast("Aa1", 22);
        list.addLast("Aa2", 18);
        list.addLast("Aa3", 23);
        list.addLast("Aa4", 24);
        list.addLast("Aa5", 20);
        list.addLast("Aa6", 25);
        list.addLast("Aa7", 24);
        list.addLast("Aa8", 26);
        list.addLast("Aa9", 23);
        list.addLast("Aa10", 20);
        list.addLast("Aa11", 28);
        list.addLast("Aa12", 18);
        
        System.out.println("LIST : ");
        list.traverse();
        System.out.println(" Delete first node having age > 20 : ");
        list.del();
        list.traverse();
        System.out.println("Display the first 5 person having age > 22 : ");
        list.display5();
        System.out.println("find second max age --> Display : ");
        list.secondAge();
        System.out.println("sort desc for age  : ");
//        list.sort();
        list.traverse();
        System.out.println("Delete last node having age = 20 : ");
        list.delete20();
        list.traverse();
        System.out.println("display last 5 person age > 22 : ");
        list.display5Last();
        System.out.println("find the third max age : ");
        MyList list1=list;
        int thirdAge = list1.thirdAge();
        System.out.println(thirdAge);
        System.out.println("/add(String xName , int xage, int index) insert the new person at the given index. : ");
        list.add("Aa12", 23, 4);
        list.traverse();
        System.out.println("sort the linked list ascendingly by name from startIndex to endIndex : ");
        list.sort(2, 5);
        list.traverse();
    }
}
