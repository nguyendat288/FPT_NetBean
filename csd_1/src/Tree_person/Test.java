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
public class Test {
    public static void main(String[] args) {
       Tree tree = new Tree();
       int[] a = {12, 7, 1, 3, 2, 5, 10, 8, 6, 9};
//         int[] a = {50, 90, 70, 100, 30, 15, 10, 40, 45, 60, 80, 55, 65, 67, 66};
        /*
                            50
                30                      90
            15      40             70        100
          10           45       
         */
        System.out.println("IsEmpty ? " + tree.isEmpty());
        for (int i = 0; i < a.length; i++) {
            tree.insert(a[i]);
        }
//        System.out.println("search : " + tree.search(70).info);
            System.out.println("PreOrder : ");
        tree.preOrder();
        System.out.println("");
        
            System.out.println("PosOrder : ");
        tree.postOrder();
        System.out.println("");
        
            System.out.println("InOrder : ");   
        tree.inOrder();
        System.out.println("");
//        
//            System.out.println("Breadth : ");
//            tree.breadth();
        System.out.println("Rotate to left : ");
        Node p = tree.search(4);
        System.out.println("...1");
        tree.rotateRight(p);
        System.out.println("...");
        tree.preOrder();
        System.out.println("");
        tree.breadth();
    }
}
