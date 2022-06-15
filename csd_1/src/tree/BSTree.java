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
public class BSTree {
    public static void main(String[] args) {
        int[] a={50,90,70,100,30,15,10,40,45};
        /*
                            50
                30                      90
            15      40             70        100
          10           45       
        */
        MyTree t = new MyTree();
        System.out.println("IsEmpty ? "+t.isEmpty());
        for(int i =0 ;i<a.length;i++){
            t.insert(a[i]);
        }
        System.out.println("PreOrder root - left - right : ");
        t.preOrder();
        System.out.println("");
        System.out.println("InOrder left - root - right : ");
        t.inOrder();
        System.out.println("");
         System.out.println("PostOrder left - right -root : ");
         t.postOrder();
         System.out.println("");
         System.out.println("Search :");
         Node p = t.search(70);
         System.out.println(p.info+" ");
         System.out.println("Clear : ");
//         t.clear();
         System.out.println("Empty ? "+t.isEmpty());
         System.out.println("Count : ");
         System.out.println(t.count());
         System.out.println("Min : "+ t.min());
         System.out.println("Max : "+ t.max());
         System.out.println("Sum : "+ t.sum());
         System.out.println("Avg : "+ t.avg());
         System.out.println("Heigh : "+ t.height());
         System.out.println("Check Avl : "+ t.checkAVL(p));        
    }
}
