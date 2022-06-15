/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Admin
 */
public class Test {
    public int sum(int n ){
        if(n>0){
            return sum(n-1)+n;
        }
        return 0;
    }
    public int min(int[] arr,int n){
        if(n==1) return arr[0];
        if(arr[n-1]<min(arr,n-1)) return arr[n-1];
        return min(arr,n-1);
    }
    public int sumArr(int[] arr,int n){
         if(n>0){
            return sumArr(arr,n-1)+arr[n];
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        Test n = new Test();
        int[] arr={1,2,4,6,3,5,7,2};
        int sum=n.sum(10);
        System.out.println("Sum : ");
        System.out.println(sum);
        System.out.println("Min : ");
        int min =n.min(arr,arr.length);
        System.out.println(min);
        System.out.println("sum arr : ");
        int min1 =n.sumArr(arr,arr.length);
        System.out.println(min1);
    }
    
}
