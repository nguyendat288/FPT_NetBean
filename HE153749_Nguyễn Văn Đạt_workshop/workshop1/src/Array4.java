
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
public class Array4 {
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
            int s =0;
            int sl =0;
            int count=0;
            System.out.print("Nhập số cần tìm : ");
            int a = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    s++;
                }else sl++;
                if(arr[i]==a){
                    count++;
                }
            }
            System.out.println("Số chẵn : "+s +", Số lẻ : "+sl);
            System.out.println("có "+count+" số "+a+" trong mảng");
            
    }
}
