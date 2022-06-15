
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
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark : ");
        int a = sc.nextInt();
        if(a<=100 && a>= 90 ){
            System.out.println("A");
        }else if(a>=80)
            System.out.println("B");
        else if(a>=70)
            System.out.println("C");
          else if(a>=60)
            System.out.println("D");
          else if(a<=59)
            System.out.println("F");
    }
}
