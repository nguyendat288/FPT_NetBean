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
// 1 ======================================================

    void addLast(String name, int age) {
        if (name.charAt(0) == 'B' || age < 17) {
            return;
        } else {
            Node p = new Node(name, age);
            if (isEmpty()) {
                head = tail = p;
                return;
            }
            tail.next = p;
            tail = p;
        }
    }

    // 2 ======================================================
    // Delete first node having age > 20
    void del() {
        if (isEmpty()) {
            return;
        }
        Node f = head;
        while (f != null && f.next != null) {
            if (f.next.info.getAge() > 20) {
                break;
            }
            f = f.next;
        }
        if (f == null) {
            System.out.println("Doesn't exist !!!");
            return;
        }
        f.next = f.next.next;
        if (f.next == null) {
            tail = f;
        }
    }

    // 3 ======================================================
// Display the first 5 person having age > 22
    void display5() {
        int count = 0;
        Node p = head;
        while (p != null) {
            if (p.info.getAge() > 22) {
                System.out.print(p.info.toString() + " ");
                count++;
            }
            if (count == 5) {
                break;
            }
            p = p.next;

        }
        System.out.println();
    }

    // 4 ======================================================
//find second max age --> Display
    int secondAge() {
        if (isEmpty()) {
            return 0;
        }
        Node p = head;
        int max = head.info.getAge();
        int secondMax = 0;
        while (p != null) {
            if (max < p.info.getAge()) {
                secondMax = max;
                max = p.info.getAge();
            }
            p = p.next;
        }
       return secondMax;
    }
    //Display 

//    void display(int secondMax) {
//        Node p = head;
//        while (p != null) {
//            if (p.info.getAge() == secondMax) {
//                System.out.print(p.info.toString() + " ");
//            }
//            p = p.next;
//        }
//        System.out.println("");
//    }

    // 5 ======================================================
    //sort desc for age 
    void sort() {
        Node pi, pj;
        pi = head;
        Person x;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                if (pj.info.getAge() > pi.info.getAge()) {
                    x = pi.info;
                    pi.info = pj.info;
                    pj.info = x;
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }

    // 6 ======================================================
//Delete last node having age = 20
    void delete20() {
        if (isEmpty()) {
            return;
        }
        int count = 0;
        Node f = head;
        while (f != null && f.next != null) {
            if (f.next.info.getAge() == 20) {
                count++;
            }
            f = f.next;
        }
        //===========================================
        f = head;
        int count1 = 0;
        while (f != null && f.next != null) {
            if (f.next.info.getAge() == 20) {
                count1++;
            }
            if (count1 == count) {
                break;
            }
            f = f.next;
        }
        if (f == null) {
            System.out.println("Doesn't exist !!!");
            return;
        }
        f.next = f.next.next;
        if (f.next == null) {
            tail = f;
        }
    }
    // 7 ======================================================
//display last 5 person age > 22 
    void display5Last() {
        if (isEmpty()) {
            return;
        }
        int count = 0;
        Node f = head;
        while (f != null && f.next != null) {
            if (f.next.info.getAge() > 22) {
                count++;
            }
            f = f.next;
        }
//        System.out.println(count);
        //===============
        int count1 = 0;
        Node p = head;
        while (p != null) {
            if (p.info.getAge() > 22) {
                count1++;

                if (count1 > count - 5 && count1 <= count) {
                    System.out.print(p.info.toString() + " ");
                }
            }
            p = p.next;

        }
        System.out.println();

    }

    // 8 ======================================================
// find the third max age
    int thirdAge() {
        if (isEmpty()) {
            return 0;
        }
        Node p = head;
        int secondMax = secondAge();
        int thirdMax=0;
        while(p!=null){
            if(secondMax > p.info.getAge() && thirdMax < p.info.getAge()){
                thirdMax =p.info.getAge();
            }
            p=p.next;
        }
        return thirdMax;
    }
//  int max(){
//      if (isEmpty()) {
//            return 0;
//        }
//      Node p= head;
//      int max= head.info.getAge();
//      while(p!=null){
//          if(max<p.info.getAge()){
//              max=p.info.getAge();
//          }
//      }
//      return max;
//  }
    //9======================================================
    //add(String xName , int xage, int index) insert the new person at the given index.
    void add(String xName, int xage, int index) {
        if (xName.charAt(0) == 'B' || xage < 17) {
            return;
        } else {
            Node x = new Node(xName, xage);
            if (isEmpty()) {
                head = tail = x;
            }
            if (index == 1 && !isEmpty()) {
                Node temp = head;
                head = x;
                x.next = temp;

                return;
            }
            int count = 1;
            Node p = head;
            while (p != null && count < index - 1) {
                p = p.next;
                count++;
            }
            Node temp = p.next;
            p.next = x;
            x.next = temp;

        }

    }

    //cound
    int count() {
        Node f = head;
        int count = 0;
        while (f != null) {
            count++;
            f = f.next;
        }
        return count;
    }

    //10======================================================
    // sort(int startIndex, int endIndex) sort the linked list ascendingly by name from startIndex to endIndex
    void sort(int startIndex, int endIndex) {
        Node pi, pj;
        pi = head;
        int count = 0;
        while (pi != null) {
            count++;
            if (count == startIndex) {
                break;
            }
            pi = pi.next;
        }

        while (pi != null) {
            if (count == endIndex) {
                return;
            }
            pj = pi.next;
            int count1 = count;
            while (pj != null) {
                if (count1 == endIndex) {
                    break;
                }
                if (pi.info.getName().compareToIgnoreCase(pj.info.getName()) > 0) {
                    Person temp = pi.info;
                    pi.info = pj.info;
                    pj.info = temp;
                }
                count1++;
                pj = pj.next;
            }
            count++;
        }
    }
//===============================   

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info.toString() + " ");
            p = p.next;
        }
        System.out.println();
    }
}
