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
        MyTree myTree = new MyTree();
        myTree.insert("Dn", 10);
        myTree.insert("Bn", 12);
        myTree.insert("Cn1", 15);      
        myTree.insert("Cn2", 16);   
        myTree.insert("Cn3", 18);
        myTree.insert("Cn4", 16);
        myTree.insert("Dn1", 13);
        myTree.insert("En", 17);
//        System.out.println("Trasever : ");
//        myTree.preOrder();
//        System.out.println("");
//        System.out.println("Summ of age : ");
//        System.out.println(myTree.sum());
//        System.out.println("Avg of age : ");
//        System.out.println(myTree.avg());
////        myTree.ghiFile();
//        System.out.println("Height : ");
//        System.out.println(myTree.height());
//        System.out.println("Total node : "+ myTree.count());
//        myTree.deleteByCopy();
//        System.out.println("");
        System.out.println("Trasever : ");
//        myTree.preOrder();   
//        System.out.println("");

        myTree.breadth2(myTree.root);
        System.out.println("");
        System.out.println("B7 : ");
        myTree.rotateRight(myTree.root);
        myTree.breadth2(myTree.root);
//        System.out.println("Trasever : ");
//        myTree.preOrder();
        System.out.println("B8");
//        System.out.println("=====================");
//        System.out.println("Trasever : ");
         myTree.Rotate3(myTree.root);
        Node x =myTree.Node3thHaveRightSon();
        myTree.rotateLeft(x);
        myTree.breadth2(myTree.root);
//        myTree.preOrder();
    }
}
