/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;


public class MyList {

    Node head;
    Node tail;

    MyList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }
//1   void addToHead(int x) - add a node with value x  at the head of  a list.
    void addFirst(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
            return;
        }
        p.next = head;
        head = p;
    }
//4 void traverse() - traverse from head to tail and dislay info of all nodes in the list.
    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info + " ");
            p = p.next;
        }
        System.out.println();
    }
    //2 void addToTail(int x) - add a node with value x  at the tail of  a list
     void addTail(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
            return;
        }
        
        tail.next = p;
        tail = p;
    }
     //3   void addAfter(Node p, int x) - add a node with value x  after the node p.
     void addAfter(Node p, int x){
         Node p1 = new Node(x);
         if(isEmpty()){
            return ;    
         }
         Node f = head;
        Node p2=null;
         while(f !=null && f.next!=null){
             if(f==p){
                 break;
             }
             f=f.next;
         }
         if(f.next == null && f ==p){
             addTail(x);
         }  
         p2=f.next;
         f.next=p1;
         p1.next=p2;       
     }
     //5   int deleteFromHead() - delete the head and return its info.
     void delFirst(){
         if(isEmpty()) return;
         head = head.next;
         if(head== null){
             tail =null;
         }
     }
     //6   int deleteFromTail() - delete the tail and return its info.
     void delLast(){
         if(isEmpty()) return;
          Node p = head;
        while (p.next.next != null) {  
             p = p.next;
        }
         p.next=null;
     }  
   //13  void dele(Node p) - delete node p if it exists in the list.
     void del(Node  p){
         if(isEmpty()){
             return ;
         }
         if(p==head ){
             delFirst();
             return;
         }
         Node pNext =p.next;
         Node f = head;
         while(f !=null && f.next !=p){
             f=f.next;
         }
         if(f==null){
             System.out.println("Doesn't exist !!!");
             return ;
         }
         f.next =pNext;
         if(f.next==null){
             tail =f;
         }
     }
       //7  int deleteAter(Node p) - delete the node after the node  p  and return its info.
     void delAfter(Node p){
          if(isEmpty()){
             return ;
         }
          if(head.next==tail){
              delLast();
          }
         del(p.next);            
     }
     
     //8 void dele(int x) - delele the first node whose info is equal to  x.
       void dele(int x) {
           if(isEmpty()) return;
           if(head.info==x){
               delFirst();
           }    
           if(tail.info==x){
               delLast();
           }         
         Node f = head;
         Node f0 =null;
         while(f !=null && f.next.info !=x ){
             f=f.next;
             f0 = f.next.next;
         }
         if(f==null){
             System.out.println("Doesn't exist !!!");
             return ;
         }
         f.next=f0;
       }
       //9 Node search(int x) - search and return the reference to the first node having info x.
       Node search(int x){
            if(isEmpty()) return null;
            Node f = head;
         while(f !=null && f.next.info !=x){
             f=f.next;
         }
         if(f==null){
             System.out.println("Doesn't exist !!!");
             return null;
         }
        return f.next;
       }
      //10  . int count() - count and return number of nodes in the list.
       int count(){
           int count =0;
           if(isEmpty()) return 0;
           Node f=head;
           while(f !=null){
             f=f.next;
             count++;
         }
           return count;
       }
       //11 void dele(int i) - delete an i-th node on the list. Besure that such a node exists
       void dele1(int i){
           int count =0;
            if(isEmpty()) return ;
              Node f=head;
             while(count < i){
             f=f.next;
             count++;
         }
             
        if(f==null){
            return;
        }
        del(f);
       }
       //12  void sort() - sort the list by ascending order of info.
        void sort(){
           Node pi,pj; 
           pi=head;
           while(pi!=null){
			pj=pi.next;
			while(pj!=null){
				if(pj.info<pi.info){
                                    int x ;
					x=pi.info;
                                        pi.info=pj.info;
                                        pj.info=x;
				}
				pj=pj.next;
			}
			pi=pi.next;
		}
        }
//18. int max() - find and return the maximum value in the list. 
void max(){
    if(isEmpty()){
        return;
    }
    Node p=head;
    int max =head.info;
    while(p!=null){
        if(max<p.info){
            max=p.info;
        }
        p=p.next;
    }
    System.out.println(max);
}
//19. int min() - find and return the minimum value in the list. 
int min(){
    if(isEmpty()){
        return -1;
    }
    Node p=head;
    int min =head.info;
    while(p!=null){
        if(min>p.info){
            min=p.info;
        }
        p=p.next;
    }
   return min;
}
 //20. int sum() - return the sum of all values in the list. 
int sum(){
    if(isEmpty()){
        return 0;
    }
    
    Node p=head;
    int sum =0;
    while(p!=null){
        sum+=p.info;
        p=p.next;
    }
   return sum;
}
//21    int avg() - return the average of all values in the list.
int avg() {
    if(isEmpty()) return -1;
    int sum =sum();
    int count= count();
    return sum/count;
}
//22. boolean sorted() - check and return true if the list is sorted, return false if the list is not sorted.
 boolean sorted(){
     if(isEmpty()) return true;
       Node p =head;
       int count=count();
       int count1 =0;
       int count2 =0;
       while(p!=null && p.next!=null){
           if(p.info<p.next.info){
               count1++;
           }
           else if(p.info>p.next.info){
               count2++;
           }else{
               count1++;
               count2++;
           }
           p=p.next;
       }
//       System.out.println(count + " "+count1 +" "+count2);
       if(count1 == count -1 || count2 == count -1){
           
           return true;
       }else return false;
 }
 
 //14. int [] toArray() - create and return array containing info of all nodes in the list.
 public  int[] toArray(){
     int lengh = count();   
     int arr[]= new int[lengh];
     if(isEmpty()) return arr;
     Node p = head;
     for(int i =0;i<arr.length;i++){
         if(p==null && p.next == null){
             break;
         }
         arr[i]= p.info;
         p=p.next;
     }
     return arr;
 }
 //15 . Merge two ordered singly linked lists of integers into one ordered list.
 //16  void addBefore(Node p, int x) - add a node with value x  before the node p.
 void addBefore(Node p, int x){
      if(isEmpty()){
        return;
    }
      Node q= new Node(x);
      Node f = head ;
      Node p2=null;
      while(f!=null && f.next!=null){
          if(f.next==p){
              break;
          }
          f=f.next;
      }
      if(f.next==null || f== null){
          System.out.println("Doesn't exist !");
      }
      
      p2=f.next;
      f.next=q;
      q.next=p2;
 }
 //17 Attach a singly linked list to the end of another singly linked list.
 void attach(MyList list2 ){
      if(isEmpty()){
      return ;    
      }
      tail.next = list2.head;   
      tail = list2.tail;
 }
// 23. void insert(int x) - insert node with value x into sorted list so that the new list is sorted.
 void insert(int x){
     addFirst(x);
     sort();
 }
//24. Reverse a singly linked list using only one pass through the list.
 MyList reverse(){
     MyList list1 =new MyList();
      Node f = head ;
      while(f!=null){
          list1.addFirst(f.info);
          f=f.next;
      }
      return list1;
 }
 
//25. Check whether two singly linked list have the same contents.
 boolean check(MyList list1,MyList list2){
 if(list1.isEmpty() || list2.isEmpty()){
     return false;
 }
 if(list1.count() !=list2.count()){
     return false;
 }
        int[] arr1=sortArr(list1.toArray());
        int[] arr2=sortArr(list2.toArray());
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
    return true;    
 }
 
 public int[] sortArr(int[] arr){
     for(int i =0 ;i< arr.length;i++){
         for(int j=0;j<arr.length;j++){
             if(arr[i]<arr[j]){
                 int temp= arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
     return arr;
 }
}
    