
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
public class Maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b,c;
        System.out.println("Enter three number : ");
         a= sc.nextInt();
         b= sc.nextInt();
         c= sc.nextInt();
         if(a>b && a>c){
             System.out.println("Max = "+ a);
             }else if(b>c && b>a) {
             System.out.println("Max = "+ b);
         }else System.out.println("Max = "+c);
         
          if(a<b && a<c){
             System.out.println("Min = "+ a);
             }else if(b<c && b<a) {
             System.out.println("Min = "+ b);
         }else System.out.println("Min = "+c);
    }
}
