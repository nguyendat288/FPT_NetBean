/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws IOException {
        MyTree t = new MyTree();
        //        t.insert("D", 9);
        t.insert("H", 7);
        t.insert("F", 10);
        t.insert("E", 8);
        t.insert("A", 7);
//        myTree.insert("An", 10);
//        myTree.insert("Bn", 12);
//        myTree.insert("Cn1", 15);
//        myTree.insert("Cn2", 16);
//        myTree.insert("Cn2", 14);
//        myTree.insert("Cn3", 18);
//        myTree.insert("Cn4", 16);
//        myTree.insert("Dn", 13);
//        myTree.insert("En", 17);
        System.out.println("Trasever : ");
        t.preOrder();
//        System.out.println("");
//        System.out.println("Summ of age : ");
//        System.out.println(myTree.sum());
//        System.out.println("Avg of age : ");
//        System.out.println(myTree.avg());
//        myTree.ghiFile();
//        System.out.println("Height : ");
//        System.out.println(myTree.height());
//        System.out.println("Total node : "+ myTree.count());
//        myTree.deleteByCopy();
//        System.out.println("Trasever : ");
//       myTree.preOrder();   
//       
    }
  
}
    