/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import abc.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
/**
 *
 * @author DELL
 */
public class DemoArayList {
    /*
    Có danh sách Product, quản lý danh sách sản phẩm: add,remove,search...
     */
}

class ManagerProduct {

    ArrayList arr;

    public ManagerProduct() {
        arr = new ArrayList();
    }

    public ManagerProduct(int capacity) {
        arr = new ArrayList(capacity);
    }

    public void addProduct(Product pro) {
        arr.add(pro);
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= arr.size()) {
            System.out.println("out of range");
            return null;
        }
        return (Product) arr.get(index);
    }

    public boolean seachProduct(Product pro) {
        return arr.contains(pro);
    }

    public Product removeProduct(int index) {
        if (index < 0 || index >= arr.size()) {
            System.out.println("out of range");
            return null;
        }
        return (Product) arr.remove(index);
    }

    // access
    public void displayAllByIndex() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public void displayAllByForEach() {
        for (Object obj : arr) {
            Product pro = (Product) obj;
            System.out.println(pro);
        }
    }

    public void displayAllByIterator() {
        Iterator ite = arr.iterator();
        while (ite.hasNext()) {
            Product pro = (Product) ite.next();
            System.out.println(pro);
        }
    }
    public void searchByName(String pname){
        Iterator ite = arr.iterator();
        while (ite.hasNext()) {
            Product pro = (Product) ite.next();
            if(pro.getPname().indexOf(pname)!=-1){
                System.out.println(pro);
            }
        }
    }

    public static void main(String[] args) {
        String st[] = {"p01;iphone12;10;1000", "p02;iphone13;2;200"};
        ManagerProduct obj=new ManagerProduct();
        for (String temp : st) {
            StringTokenizer stk=new StringTokenizer(temp,";");
            Product pro=new Product(stk.nextToken(), stk.nextToken(),
                    Integer.parseInt(stk.nextToken()),
                    Double.parseDouble(stk.nextToken()));
            obj.addProduct(pro);
        }
        obj.displayAllByIterator();
    }

}
