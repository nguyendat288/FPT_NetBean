/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Admin
 */
public class LinkedList {

    public static void main(String[] args) {
        MyList list = new MyList();        
        System.out.println("is Empty ? " + list.isEmpty());
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(14);
        list.addFirst(1);
        list.addFirst(7);
        list.addFirst(9);
        Node p0= list.search(7);
        list.traverse();
        System.out.println("Add After : ");
        list.addAfter(p0, 10);
        // them đầu
        list.traverse();
        System.out.println("is Empty ? " + list.isEmpty());
        // thêm cuối
        list.addTail(12);
        list.addTail(0);
        // in
        System.out.println("Array : ");
        list.traverse();
        // xoá đầu
        System.out.println("Xoá đầu ");
        list.delFirst();
        // in
        list.traverse();
        // xoá cuối
        System.out.println("Xoá cuối ");
        list.delLast();
        //in
        list.traverse();
         Node p2= list.search(3);
        System.out.println("Xoá nút đứng sau  : ");
        list.delAfter(p2);  
//   list.del(p2);
//        list.del(p0);
//        list.dele(14);
        list.traverse();
        System.out.println("Đếm : ");
        System.out.println(list.count());
        System.out.println("Đã sắp xép chưa ? ");
        System.out.println(list.sorted());
        System.out.println("Sắp xếp");
        list.sort();
        list.traverse();
        System.out.println("Đã sắp xép chưa ? ");
        System.out.println(list.sorted());
        
        System.out.println("Search : ");
        System.out.println(list.search(3));
        System.out.println("Max : ");
        list.max();
        if (list.min() == -1) {
            System.out.println("Empty");
        } else {
            System.out.println("Min : " + list.min());
        }
        System.out.println("====================================================");
        System.out.println("Array : ");
        int arr[]= list.toArray();
        for(int a : arr){
            System.out.print(a+"  ");
        }
        System.out.println("");
        System.out.println("Add before : ");
        Node p3= list.search(14);
        list.addBefore(p3, 11);
         list.traverse();
         System.out.println("Attack list : ");
         list.attach(list);
         list.traverse();
        System.out.println("Reverse : ");
        MyList list1 = list.reverse();
        list1.traverse();
        System.out.println("Chẹck trùng : ");
        MyList list2 = list;
        System.out.println("List 1 : ");
        list.traverse();        
        list2.del(p3);
        System.out.println("List 2 : ");
       
        list2.addFirst(14);
         list2.traverse();
//        list2.addFirst(0);    
        if(list.check(list1,list2)){
            System.out.println("Trùng");
        }else System.out.println("false");
//     1-12 vaf 18-22
    }
}
