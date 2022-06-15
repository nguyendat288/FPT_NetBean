/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_person;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Admin
 */
public class Tree {

    Node root;

    public Tree() {
        root = null;
    }
// clean tree

    void clean() {
        root = null;
    }
// check empty 

    boolean isEmpty() {
        return root == null;
    }
//3. search 

    Node search(int x) {
        Node p = root;
        if (isEmpty()) {
            return null;
        }
        while (p != null) {
            if (p.info == x) {
                return p;
            }
            if (p.info < x) {
                p = p.right;
            }
            if (p.info > x) {
                p = p.left;
            }
        }
        return null;
    }
    //4. insert 
    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node p = root;
        Node parent = null;
        while (p != null) {
            if (p.info == x) {
                return;
            }
            parent = p;
            if (p.info > x) {
                p = p.left;
            } else {
                p = p.right;
            }

        }
        //p = null là vịis insert x vào cây 
        //  x là con của parent
        //cần xác định x là co trái hay con phải
        if (parent.info > x) {
            parent.left = new Node(x);
        } else {
            parent.right = new Node(x);
        }
    }
// display
  
    void visit(Node p) {
        if(p!= null){
            System.out.print(p.info+ " ");
        }
    }
      //5 void breadth() - traverse a tree.
    void breadth() {
        if (isEmpty()) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            visit(p);
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
        }
        System.out.println();
    }
//    void breadth(){
//        Node p = root;
//        if(isEmpty()){
//            return;
//        }
//        MyQueue q = new MyQueue();
//        q.enqueue(p);
//        Node r ;
//        while(p!= null){
//            r = q.dequeue();
//            visit(r);
//            if(r.left != null){
//                q.enqueue(r.left);
//            }
//            if(r.right != null){
//                q.enqueue(r.right);
//            }
//        }
//    }
    // rotate
     Node rotateToRight(Node p) {
        if (p == null || p.left == null) {
            return p;
        }
        Node q = p.left;
        p.left = q.right;
        q.right = p;
        return q;

    }

    //rotate left root => mục đich để cho độ cao bằng nhau
    Node rotateToLeft(Node p) {
        if (p == null || p.right == null) {
            return p;
        }
        Node q = p.right;
        p.right = q.left;
        q.left = p;
        return q;

    }

    //rotate right
    public Node rotateRight(Node p) {
        if (p.left == null) {
            return p;
        }
        Node q = p.left;
        p.left = q.right;
        q.right = p;
        return q;
    }

    //rotate left
    public Node rotateLeft(Node p) {//must be have node right
        if (p.right == null) {
            return p;
        }
        Node q = p.right;
        p.right = q.left;
        q.left = p;
        return q;
    }

    // 6 Duyệt phần tử theo root - left - right
    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void preOrder() {
        preOrder(root);
        System.out.print(" ");
    }
    //7 Duyệt phần tử theo left - root - right

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    void inOrder() {
        inOrder(root);
        System.out.print(" ");
    }

    //8  Duyệt phần tử theo left - right -root
    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    void postOrder() {  
        postOrder(root);
        System.out.print(" ");
    }
    
//    public void levelOrder() {
//		if(root == null) {
//			return;
//		}
//		
//                    Queue<MyQueue> queue = new LinkedList<>();
//		queue.offer(root);
//		
//		while(!queue.isEmpty()) {
//			MyQueue temp = queue.poll();
//			System.out.print(temp.data + " ");
//			if(temp.left != null) {
//				queue.offer(temp.left);
//			}
//			if(temp.right != null) {
//				queue.offer(temp.right);
//			}
//		}
//	}
}
