
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
public class Array3 {
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
            int sum =0;
            for(int i=0;i<n;i++){
                sum+=arr[i]*arr[i];
            }
            System.out.println("Total : "+sum);
    }
}
