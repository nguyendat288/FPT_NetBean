/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Part1 {
    static Scanner sc  = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // TODO code application logic here
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
        System.out.println("Mattrix inputted : ");
         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.format("%3d",arr[i][j]);
            }
        }
         int sum=0;
          for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum+=arr[i][j];
            }
        }
          System.out.println("\nSum :"+sum);
        System.out.println("Average : "+(float)sum/(x*y));  
    }
}
