/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class MyTree {

    Node root;
    File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\csd2\\q2.txt");

    public MyTree() {
        root = null;
    }

    // isEmpty 
    boolean isEmpty() {
        return root == null;
    }
    //xóa các phần tử trong tree

    void clear() {
        root = null;
    }

    // check name 
    int checkName(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Trasever preOrder 
    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void preOrder() {
        Node p = root;
        preOrder(p);
    }

    void visit(Node p) {
        if (p != null) {
            System.out.print(p.info + " ");
        }
    }
    // Trasever PosOrder 

    void postOrder(Node p) throws IOException {
        if (p == null) {
            return;
        }
        write(p);
        postOrder(p.left);
        postOrder(p.right);
    }

    void postOrder() throws IOException {
        Node p = root;
        postOrder(p);
    }
//     1. void insert(String xName, int xAge) - check if the first letter of xName is 'B'
//(i.e. xName.charAt(0) == 'B') then do nothing, otherwise insert new person
//with name=xName, age=xAge to the tree.
void insert(String name, int age) {
        if (name.charAt(0) == 'B') {
            return;
        } else {
            Node f = root;
            Node p = new Node(name, age);
            Node parent = null;  // root khong co cha
            if (isEmpty()) {
                root = p;
                return;
            }
            while (f != null) {
                if (f.info.getName().compareTo(name) == 0) {
                    return;
                }
                parent = f;           // parent di chuyen truoc p va luu tru cac Node
                if (f.info.getName().compareTo(name) < 0) {
                    f = f.left;
                }
                if (f.info.getName().compareTo(name) > 0) {
                    f = f.right;
                }
            }
            // p = null, la vi tri chen x vao cay 
            // x la con cua parent 
            // xac dinh x la con trai hay con phai cua parent 
            if (parent.info.getName().compareTo(name) < 0) {
                parent.left = p;
            }
            if (parent.info.getName().compareTo(name) > 0) {
                parent.right = p;
            }
        }

    }
//    void insert(String xName, int xAge) {
//        if (xName.charAt(0) == 'B') {
//            return;
//        }
//        Node x = new Node(xName, xAge);
//        if (isEmpty()) {
//            root = x;
//            return;
//        }
//
//        Node f, p;
//        f = null;
//        p = root;
//        int check;
//        while (p != null) {
//            check = checkName(p.info.getName(), xName);
//            if (check == 0) {
//                System.out.print("The key" + x.info + " already exists!");
//                return;
//            }
//            f = p;
//            if (check < 0) {
//                p = p.left;
//            }
//            if (check > 0) {
//                p = p.right;
//            }
//        }
//        check = checkName(f.info.getName(), xName);
//        if (check < 0) {
//            f.left = x;
//
//        }
//        if (check > 0) {
//            f.right = x;
//        }
//    }
    
    
//  2. Save all elements having age < the average age of the tree in format (name,
//age) to the file “q2.txt” by post-order traverse

    int sum(Node p) {
        if (p == null) {
            return 0;
        }
        // use recursive
        return (p.info.getAge() + sum(p.left) + sum(p.right));
    }

    int sum() {
        Node p = root;
        return sum(p);
    }

    // avg of age
    int avg() {
        return sum(root) / count(root);
    }

    public void ghiFile() throws IOException {
        postOrder();
    }

    void write(Node p) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            int avg = avg();
            if (p.info.getAge() < avg) {
                bufferedWriter.write(p.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }
    //3. Calculate the height of the tree.
   int height(Node p) {
        if (p == null) {
            return 0;
        }
        int l = height(p.left) + 1;
        int r = height(p.right) + 1;
        return (l > r) ? l : r;
    }
        int height() {
        Node p = root;
        return height(p);
    }
    //4. Calculate the number of nodes of the tree. 
       int count(Node p) {
        if (p == null) {
            return (0);
        }
        int k, h, r;
        k = count(p.left);
        h = count(p.right);
        r = k + h + 1;
        return (r);
    }
       int count() {
        Node p = root;
        return count(p);
    }
//5. Delete the root of the tree by copying.
       void deleteByCopy() {
        Node f, p;
        f = null;
        p = root;
        // p has left son only
        
        if (p.left != null && p.right == null) {
            if (f == null) { // p = root;
                root = p.left;
            } else {
                if (f.left == p) {
                    f.left = p.left;
                } else {
                    f.right = p.left;
                }
            }
            return;
        }
        // p has right son only
        if (p.left == null && p.right != null) {
            if (f == null) { // p = root;
                root = p.right;
            } else {
                if (f.left == p) {
                    f.left = p.right;
                } else {
                    f.right = p.right;
                }
            }
            return;
        }
        // p has two son
        if (p.left != null && p.right != null) {
            // find the right most node in the left subtree;
            Node q = p.left;
            Node frp, rp;
            frp = null;
            rp = q;
            while (rp.right != null) {
                frp = rp;
                rp = rp.right;
            }
            // rp now is the right most node;
            p.info = rp.info;
            if (frp == null) {
                // q is the right most node;
                p.left = q.left;

            } else {
                frp.right = rp.left;
            }
        }
    }
       //6. Perform breadth-first traverse from the root and delete 
//       by copying the second node having age >= the average age.
        void breath() {
            Node p=root;
        if (p == null) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(p);
        Node f=null;
        int count =0;
        while (!q.isEmpty()) {
            f = q.dequeue();
            if(f.info.getAge()>=avg()){
                count++;
            }
            if(count==2){
                break;
            }
//            visit(r); //print
            if (f.left != null) {
                q.enqueue(f.left);
            }
            if (f.right != null) {
                q.enqueue(f.right);
            }
        }
            deleteByCopy(f);
    }     
        
    void deleteByCopy(Node x) {
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if (p == x) {
                break;
            }
            f = p;
            int check = checkName(x.info.getName(), p.info.getName());
            if (check >0) {
                p = p.left;
            } if(check <0) {
                p = p.right;
            }
        }
        if (p == null) {
            return;
        }
        
        // p is a leaf-node;
        if (p.left == null && p.right == null) {
            if (f == null) { // p = root;
                root = null;
            } else {
                if (f.left == p) {
                    f.left = null;
                } else {
                    f.right = null;
                }
            }
            return;
        }
        // p has left son only
        if (p.left != null && p.right == null) {
            if (f == null) { // p = root;
                root = p.left;
            } else {
                if (f.left == p) {
                    f.left = p.left;
                } else {
                    f.right = p.left;
                }
            }
            return;
        }
        // p has right son only
        if (p.left == null && p.right != null) {
            if (f == null) { // p = root;
                root = p.right;
            } else {
                if (f.left == p) {
                    f.left = p.right;
                } else {
                    f.right = p.right;
                }
            }
            return;
        }
        // p has two son
        if (p.left != null && p.right != null) {
            // find the right most node in the left subtree;
            Node q = p.left;
            Node frp, rp;
            frp = null;
            rp = q;
            while (rp.right != null) {
                frp = rp;
                rp = rp.right;
            }
            // rp now is the right most node;
            p.info = rp.info;
            if (frp == null) {
                // q is the right most node;
                p.left = q.left;

            } else {
                frp.right = rp.left;
            }
        }

    }
    //
}
