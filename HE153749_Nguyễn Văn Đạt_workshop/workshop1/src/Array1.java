
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
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Nhập số phần tử trong mảng  : ");
        n = sc.nextInt();
            float[] arr = new float[n];
            for(int i=0;i<n;i++){
                System.out.print("Nhập phần tử thứ "+i+" :");
                arr[i]=sc.nextFloat();
            }
            System.out.print("Các phần tử dương là : ");
             int sum =0;
            for(float a: arr){
                if (a<0){
                   
                    sum+=a;
                }else
                System.out.print(a+" ");
            }
            System.out.println("\nTổng các phần tử âm là : "+ sum);
            System.out.print("Sắp xếp : ");
            sort(arr);
    }
    
    public static void sort(float[] arr){
        for(int i=0 ;i<arr.length;i++){
                 for(int j=i+1 ;j<arr.length;j++){
        if(arr[i]<arr[j]){
            float temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
                 }       
    }
         for(float a : arr){        
                     System.out.print(a+" ");
                 }
}
}
