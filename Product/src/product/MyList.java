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
public class MyList {

    Node head;
    Node tail;

    MyList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(String name, double price, int quantity) {
        if (name.contains("na") || price > 30) {
            return;
        } else {
            Node a = new Node(name, price, quantity);
            if (isEmpty()) {
                head = tail = a;
                return;
            }
            tail.next = a;
            tail = a;

        }
    }
    
    //
    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info.toString() + " ");
            p = p.next;
        }
        System.out.println();
    }
//void displayByPrice(double price) –
// display information of the products which have the given price (with the format like an example above).

    void displayByPrice(double price) {
        Node p = head;
        while (p != null) {
            if (p.info.getPrice() == price) {
                System.out.print(p.info.toString() + " ");
            }
            p = p.next;
        }
        System.out.println();
    }

    //sort
    void sortByName() {
        if (isEmpty()) {
            return;
        }
        Node pi, pj;
        pi = head;

        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pi.info.getName().compareToIgnoreCase(pj.info.getName()) > 0) {
                    Product temp = pi.info;
                    pi.info = pj.info;
                    pj.info = temp;
                }
                if (pi.info.getName().equals(pj.info.getName())) {
                    if (pi.info.getPrice() < pj.info.getPrice()) {
                        Product temp = pi.info;
                        pi.info = pj.info;
                        pj.info = temp;
                    }
                }

                pj = pj.next;
            }
            pi = pi.next;
        }
    }

    //delete
    int deleteUnderPrice(double value) {
        Node f = head;
        int count = 0;
        while (f != null) {
            if (f.info.price < value) {
                del(f);
                count++;
            }
            f = f.next;
        }
        return count;
    }
    //

    void delFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    //
    void del(Node p) {
        if (isEmpty()) {
            return;
        }
        if (p == head) {
            delFirst();
            return;
        }
        Node pNext = p.next;
        Node f = head;
        while (f != null && f.next != p) {
            f = f.next;
        }
        if (f == null) {
            System.out.println("Doesn't exist !!!");
            return;
        }
        f.next = pNext;
        if (f.next == null) {
            tail = f;
        }
    }
//
      double max(){
          Node p = head;
           double max= p.info.getQuantity()*p.info.getPrice();
        while(p!=null){
            if(max<p.info.getQuantity()*p.info.getPrice()){
                max=p.info.getQuantity()*p.info.getPrice();
            }
            p=p.next;
        }      
        return max;
      }
    //di chuyển tất cả các sản phẩm có giá trị cao nhất (giá trị = số lượng * giá) đến cuối danh sách.
    void moveHighestValue(){
         if (isEmpty()) {
            return;
        }
           Node p = head;
        double max=max();
        while(p!=null){
            double x=p.info.getQuantity()*p.info.getPrice();
         if(x== max){
             Node f = p;
             del(p);
             add(f.info.getName(),f.info.getPrice(),f.info.getQuantity());
         }
         p=p.next;
    }
}
}