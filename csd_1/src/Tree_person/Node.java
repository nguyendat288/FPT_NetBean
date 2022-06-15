/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_person;

/**
 *
 * @author Admin
 */
public class Node {
    int info;
    Node left,right;
    int level,bal;

    public Node() {
    }

    public Node(int x) {
       this.info= x;
       this.left = right = null;
    }
    
}
