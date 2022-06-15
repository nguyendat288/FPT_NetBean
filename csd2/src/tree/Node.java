/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Admin
 */
public class Node {
    Person info;
    Node left,right;

    public Node() {
    }

    public Node(Person info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }
    public Node(String name, int age) {
        info = new Person(name, age);
        left=right = null;
    }
     public String ghi(){
        return "[ "+info.getName()+"//"+info.getAge()+"]";
    }
      
}
