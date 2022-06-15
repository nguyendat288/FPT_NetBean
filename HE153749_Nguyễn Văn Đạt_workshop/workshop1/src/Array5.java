
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
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             int x,y;
        System.out.print("Enter number of rows: ");
        x= sc.nextInt();
        System.out.print("Enter number of columns: ");
        y= sc.nextInt();
        int [][] arr = new int[x][y]; 
          System.out.print("Enter the matrix: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]+"  ");
                if(i%2==1){
                    sum+=arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Tổng hàng chẵn là : "+sum);
        
        
          for (int i = 0; i < x; i++) {
            for (int j = i; j < y; j++) {           
              if(arr[i][j]>arr[j][j]){
                  int temp=arr[j][j];
                  arr[j][j]=arr[i][j];
                  arr[i][j]=temp;
              }
            }
        }
          System.out.println("After sort : ");
          for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        } 
          
    }
   
}
