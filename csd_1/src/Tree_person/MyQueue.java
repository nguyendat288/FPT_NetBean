/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_person;

import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class MyQueue {

    LinkedList<Node> t;

    public MyQueue() {
        t = new LinkedList<>();
    }

    void clear() {
        t.clear();
    }

    boolean isEmpty() {
        return t.isEmpty();
    }

    void enqueue(Node p) {
        t.addLast(p);
    }

    Node dequeue() {
        if (isEmpty()) {
            return null;
        }
        return t.removeFirst();
    }

    Node font() {
        if (isEmpty()) {
            return null;
        }
        return t.getFirst();
    }
}
