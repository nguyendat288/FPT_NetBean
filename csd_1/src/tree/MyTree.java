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
public class MyTree {

    Node root;

    public MyTree() {
        this.root = null;
    }

    //1
    boolean isEmpty() {
        return root == null;
    }
//2

    void clear() {
        if (isEmpty()) {
            return;
        }
        root = null;
    }

    //3
    Node search(int x) {
        Node p = root;
        if (p == null) {
            return null;
        }
        while (p != null) {
            if (x == p.info) {
                return p;
            }
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        return null;
    }

    //4
    void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
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

    //5 void breadth() - traverse a tree.
    void visit(Node p) {
        System.out.print(p.info + " ");
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
//  9  int count() - count and return number of nodes in the tree.

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
//int count(Node p){
//        if(p == null) return 0;
//        return 1 + count(p.left) + count(p.right);
//    }   
    //10 .void dele(int x) - delete a node having value x.

//    void dele(int x) {
//        Node p = search(x);
//
//    }
    //11. Node min() - find and return the node with minimum value in the tree. 
    int min(Node p) {

        Node c = p;
        while (c.left != null) {
            c = c.left;
        }
        return c.info;
    }

    int min() {
        Node p = root;
        return min(p);
    }

    // 12. Node max() - find and return the node with maximum value in the tree
    int max(Node p) {

        Node c = p;
        while (c.right != null) {
            c = c.right;
        }
        return c.info;
    }

    int max() {
        Node p = root;
        return max(p);
    }

    //13. int sum() - return the sum of all values in the tree. 
    int sum(Node p) {
        if (p == null) {
            return 0;
        }
        // use recursive
        return (p.info + sum(p.left) + sum(p.right));
    }

    int sum() {
        Node p = root;
        return sum(p);
    }

    //14. int avg() - return the average of all values in the tree.
    int avg() {
        return sum(root) / count(root);
    }

    //15.  The height of a tree is the maximum number of nodes on a 
//     path from the root to a leaf node. Write a  function that returns the height of a binary tree.
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
//     16. The cost of a path in a tree is sum of the keys of the nodes participating  in that path.
//     Write a  function that returns the cost of the most expensive  path from the root to a leaf node
    int maxLen;
    int maxSum;
    void expensivePathTree(Node p, int sum, int leng){
        if(p == null){
            if(maxLen < leng){
                maxLen = leng;
                maxSum = sum;
            }
            else if(maxLen == leng && maxSum < sum){
                maxSum = sum;
            }
            return;
        }
        expensivePathTree(p.left, sum + p.info, leng + 1);
        expensivePathTree(p.right, sum + p.info, leng + 1);
    }
    
    int cost(Node p){
        if(p == null){
            return 0;
        }
        maxSum = Integer.MIN_VALUE;
        maxLen = 0;
        
        expensivePathTree(p, 0, 0);
        return maxSum;
    }
    // 17. Write a  function to determine whether a given binary tree is AVL or not.
        boolean checkAVL(Node p) {
        if (p == null) {
            return true;
        }
        int l = height(p.left) + 1;
        int r = height(p.right) + 1;
        if(l-r <=1 && l-r > -1){
            return true;
        }else return false;
        }
          boolean checkAVL() {
        Node p = root;
        return checkAVL(p);
    }
//     18. What value does the following function return when called with each of the binary trees in question 3?
//int mystery(Node x) {
//if (x == null)
//return 0; 
//else
//return max(mystery(x.left), mystery(x.right));
//     19. Write a  function to determine whether a given binary tree is a heap.

}
