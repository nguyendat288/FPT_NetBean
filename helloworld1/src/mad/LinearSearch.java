/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearch {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,214,51,21,5,2,6,7,4};  
        int x=linearSearch(arr);
//        int x = binarySearch(arr);
        if(x!=-1){
            System.out.println("The element you want to find is at position :"+x);
        }else System.out.println("doesn't exist ! ");
    }

    
    public static int linearSearch(int[] arr){
        System.out.println("Enter the element you want to find : ");
        int x= sc.nextInt();
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) 
        return i; 
   
}
  return -1;
    }
    public int  binarySearch (int[] arr) {
          System.out.println("Enter the element you want to find : ");
        int x= sc.nextInt();
  int left = 0, right =arr.length-1, mid;
  do {
    mid = (left + right) / 2;
    if (arr[mid] == x) return mid;
    else if (arr[mid] <= x) left = mid + 1;
    else right = mid - 1;
  } while (left <= right);
  return -1;
}
}
