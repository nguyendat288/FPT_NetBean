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
public class MyTree {
//public class MyTree {

    Node root;

    public MyTree() {
        root = null;
    }
//1.   boolean isEmpty() -   return true if a tree is empty, return false otherwise.

    boolean isEmpty() {
        return root == null;
    }
//2.   void clear() - clear a tree.    

    void clear() {
        root = null;
    }

//3.   Node search(int x) - Search a node having value x. Return a reference to that node if found, return null otherwise.
// Tìm node có giá trị là x kể từ node p
    public Node search(Node p, int key) {
        if (p == null) {
            return null;
        }
        if (p.info == key) {
            return p;
        } else if (p.info > key) {
            return search(p.left, key);
        } else {
            return search(p.right, key);
        }
    }

    public Node search(int x) {
        Node tmp = search(root, x);
        return tmp;
    }
//4.   void insert(int x) - check if the key x does not exists in a tree then insert new node with value x into the tree.   

    public void insert(int x) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node p = root;
        Node parent = null;// vi root khong co cha
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
        // p = null la vi tri chen x vao cay
        // x la con cua parent
        //can xd x la con trai hay phai cua parent
        if (parent.info > x) {
            parent.left = new Node(x);
        } else {
            parent.right = new Node(x);
        }

    }
//4.2 Chèn nhiều phần tử vào cây

    void insertMany(int a[]) {
        for (int i = 0; i < a.length; i++) {
            insert(a[i]);
        }
    }

    public void visit(Node p) {
        System.out.print(p.info + " ");
    }

    //5.   void breadth() - traverse a tree.
    public void breadth() {
        if (isEmpty()) {
            return;
        }
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;//not trung gian
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            //hien thi root
            visit(p);
            // them cac con cua no
            if (p.left != null) {
                q.enqueue(p.left);
            }
            if (p.right != null) {
                q.enqueue(p.right);
            }
        }
        System.out.println();
    }
//6.   void preorder(Node p) - recursive preorder traverse of a tree.

    public void preOder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOder(p.left);
        preOder(p.right);
    }

    public void preOder() {
        preOder(root);
        System.out.println();
    }
//7.   void inorder(Node p) - recursive inorder traverse of a tree.

    public void inOrder(Node p) {
        if (p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

//8.   void postorder(Node p) - recursive postorder traverse of a tree.
    public void postOrder(Node p) {
        if (p == null) {
            return;
        }
        postOrder(p.left);
        postOrder(p.right);
        visit(p);
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

//9.   int count() - count and return number of nodes in the tree.
    public int count(Node p) {
        //if tree is empty
        if (p == null) {
            return 0;
        }
        //recursive call to left child and right child and
        // add the result of these with 1 ( 1 for counting the root)
        return 1 + count(p.left) + count(p.right);
    }

    public int count() {
        int k = count(root);
        return k;
    }
//10.Xóa một giá trị x

    void delete(int x) {
        //tìm nốt chứa x 
        //phân loại trường hợp để xóa node chứa x
        if (isEmpty()) {
            return;
        }
        Node p = root;
        Node parent = null;
        while (p != null) {
            if (p.info == x) {
                break;
            }
            parent = p;
            if (p.info > x) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        //p = null or p chứa x

        if (p == null) {
            return;//cây không có giá trị x
        }        // p chắc chắn là khác null
        /**
         * *********** TH1 - p không có con  ****
         */
        /*
                 parent          parent                  p
            p                           p
         */
        if (p.left == null && p.right == null) {
            if (parent == null) {
                root = null;
                return;
            }
            if (parent.left == p) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        /**
         * *********** TH2 - p có 1 con     ****
         */
        /*
            parent      parent       parent           parent             p  p
           p          p                    p                  p         L     R
        L                R              L                        R
         */
        if ((p.left != null) && (p.right == null)
                || (p.left == null) && (p.right != null)) {
            //hoàn thiện code

        }
        /**
         * *********** TH3 - p có 2 con     ****
         */
        /*
                                  p                                   p
                  p.L                          p.R              rm
                    ...                                       L                       
                      parentRightmost
                                       rm
         */
        if (p.left != null && p.right != null) {
            //tìm rightmost của p.left
            //copy giá trị của rightmost vào p 
            // xóa rightmost
            Node rm = p.left;
            Node parentRM = null;
            while (rm.right == null) {
                parentRM = rm;

                rm = rm.right;
            }
            //rm = không bao giờ bằng null
            //parentRM  có thể bằng null
            p.info = rm.info;
            if (parentRM == null) {
                p.left = rm.left;
            } else {
                parentRM.right = rm.left;
            }
        }

    }

    //Xóa node có giá trị x trong cây
    void deleteByCopy(int x) {
        if (isEmpty()) {
            return;
        }
        Node f, p;
        //thằng muốn xóa là thằng p có giá trị là x
        //f là cha của p. Khi mình xóa gắn f.right or.left = null là xong
        f = null;
        p = root;
        while (p != null) {
            if (p.info == x) {
                break;
            }
            f = p;//gán cha bằng thằng con hiện tại
            // con sẽ lùi xuống 1 bậc
            if (x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if (p == null) {
            return;//not found
        }

        //p là node lá
        if (p.left == null && p.right == null) {
            if (f == null) {
                root = null;
                return;
            }
            if (p == f.left) {
                f.left = null;
            } else {
                f.right = null;
            }
            return;
        }

        //p có con trái 
        if (p.left != null && p.right == null) {
            if (f == null) {
                root = p.left;
            } else {
                if (p == f.left) {
                    f.left = p.left;
                } else {
                    f.right = p.left;
                }
            }
            return;
        }

        //p chỉ có con phải
        if (p.left == null && p.right != null) {
            if (f == null) {
                root = p.right;
            } else {
                if (p == f.left) {
                    f.left = p.right;
                } else {
                    f.right = p.right;
                }
            }
            return;
        }

        //p có cả 2 con
        /*
                              15
                  10                         30
              5        11               20        40
                            12
        Muốn xóa node 15 tìm bên trái node p là 10 và phải cùng 
        của 10 là 12. Ta lấy 12 thay cho 15 rồi xóa 12 đi là xong
        */
        if (p.left != null && p.right != null) {
            Node q = p.left;
            Node frp, rp;
            frp = null;
            rp = q;
            while (rp.right != null) {
                frp = rp;
                rp = rp.right;
            }
            //rp chính là node phải cùng của nửa trái
            p.info = rp.info;
            if(frp == null){
                p.left = q.left;
            }else{
                frp.right = rp.left;
            }
        }

    }
//11. Node min() - find and return the node with minimum value in the tree. 

    public Node min() {
        if (root == null) {
            return null;
        }
        Node tmp = root;

        while (tmp.left != null) {
            tmp = tmp.left;//vòng lặp để tìm kiếm bên trái của cây
        }
        return tmp;
    }

//12. Node max() - find and return the node with maximum value in the tree. 
    public Node max() {
        if (root == null) {
            return null;
        }
        Node tmp = root;

        while (tmp.right != null) {
            tmp = tmp.right; //vòng lặp để tìm kiếm bên phải của cây
        }
        return tmp;
    }

//13. int sum() - return the sum of all values in the tree. 
    public int sum(Node root) {

        if (root == null) {
            return 0;
        }
        return (root.info + sum(root.left) + sum(root.right));
    }

    public int sum() {
        int total = sum(root);
        return total;
    }
//14. int avg() - return the average of all values in the tree.

    public int avg(Node root) {
        int s = sum();
        int cnt = count();
        return s / cnt;
    }

    public int avg() {
        return avg(root);
    }
//15. The height of a tree is the maximum number of nodes on a path from the root to a leaf node. Write a  function that returns the height of a binary tree.
    //height of tree

    public int height(Node p) {
        if (p == null) {
            return 0;
        } else {
            int lDepth = height(p.left);//compute the depth of each subtree
            int rDepth = height(p.right);
            if (lDepth > rDepth) {
                return (lDepth + 1);//use the larger one
            } else {
                return (rDepth + 1);
            }
        }
    }

    public int height() {
        return height(root);
    }

//16. The cost of a path in a tree is sum of the keys of the nodes participating  
//    in that path. Write a  function that returns the cost of the most expensive  path from the root to a leaf node.     

    int maxLen;
    int maxSum;

    void expensivePathTree(Node p, int sum, int leng) {
        if (p == null) {
            if (maxLen < leng) {
                maxLen = leng;
                maxSum = sum;
            } else if (maxLen == leng && maxSum < sum) {
                maxSum = sum;
            }
            return;
        }
        expensivePathTree(p.left, sum + p.info, leng + 1);
        expensivePathTree(p.right, sum + p.info, leng + 1);
    }

    int cost(Node p) {
        if (p == null) {
            return 0;
        }
        maxSum = Integer.MIN_VALUE;
        maxLen = 0;

        expensivePathTree(p, 0, 0);
        return maxSum;
    }
    
//17. Write a  function to determine whether a given binary tree is AVL or not.
    
//18. What value does the following function return when called with each of the binary trees in question 3?
//int mystery(Node x) {
//if (x == null)
//return 0;
//else
//return max(mystery(x.left), mystery(x.right));
//}
//19. Write a  function to determine whether a given binary tree is a heap.
   
    //balance a tree
    public void balance(int[] a, int first, int last){
        if(first < last){
            int middle  = (first + last)/2;
            insert(a[middle]);
            balance(a, first, middle-1);
            balance(a, middle+1, last);
        }
    }
    
    public void balance(int a[]){
        balance(a, 0, a.length-1);
    }
}
//    public static void main(String[] args) {
//        Tree tree = new Tree();
//
//        int[] a = {50, 90, 70, 100, 30, 15, 10, 40, 45, 60, 80, 55, 65, 67, 66};
//        /*
//                            50
//                30                      90
//            15      40             70        100
//          10           45       
//         */
//        System.out.println("IsEmpty ? " + tree.isEmpty());
//        for (int i = 0; i < a.length; i++) {
//            tree.insert(a[i]);
//        }
//        System.out.println("search : " + tree.search(70).info);
////            System.out.println("PreOrder : ");
//        tree.preOrder();
//        System.out.println("");
////            System.out.println("Breadth : ");
////            tree.breadth();
//        System.out.println("Rotate to left : ");
//        Node p = tree.search(70);
//        tree.rotateRight(p);
//        System.out.println("...");
//        tree.preOrder();
//        System.out.println("");
//        tree.breadth();
//    }
