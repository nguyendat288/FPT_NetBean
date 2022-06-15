package csd_1;

import java.util.ArrayList;
import java.util.List;

public class Csd_1 {

    ArrayList list = new ArrayList();
    //1

    public void addToHead(int x) {
        list.add(0, x);
    }

    //2
    public void addToTail(int x) {
        list.add(x);
    }

    //3
    public void addAfter(Object p, int x) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                index = i;
            }
        }
        if (index != -1) {
            list.add(index + 1, x);
        }
    }

    //4
    public void traverse() {
        for (Object a : list) {
            System.out.println(a);
        }
    }

    //5
    public void deleteFromHead() {
        list.remove(0);
    }

    //6
    public void deleteFromTail() {
        list.remove(list.size() - 1);
    }

    //7
    public void deleteAter(Object p) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(p)) {
                index = i;
            }
        }
        if (index != -1) {
            if (index == list.size()) {
                System.out.println("Doesn't exist !!!");
            } else {
                System.out.println(list.get(index));
                list.remove(index);
            }
        }
    }

    //8
    public void dele(int x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(x)) {
                list.remove(i);
                return;
            }
        }
    }

    //9
    public void search(int x) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(x)) {
                System.out.println(list.get(i) + " " + i);
                index = i;
                return;
            }
        }
        if (index == -1) {
            System.out.println("doesn't exist!");
        }
    }

    //10
    public int count() {
        return list.size() - 1;
    }
    public 
}
