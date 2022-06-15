
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Nhập số phần tử trong mảng  : ");
        n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                System.out.print("Nhập phần tử thứ "+i+" :");
                arr[i]=sc.nextInt();
            }
            int result=0;
    System.out.println("Các số hoàn hảo là : ");
    for(int j =0;j<arr.length;j++){
        if(check1(arr[j])==true){
            System.out.println(arr[j]+ " ");
            result +=arr[j];
        }
    }
        System.out.println("Result = "+result);
    }
    
    public static boolean check1(int a ){
       int sum=0;
       for(int i=1;i<a;i++){
           if(a%i==0){
               sum+=i;
           }
    }
       if(sum==a){
           return true;
       }else 
           return false;
    }

}
