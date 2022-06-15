
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
public class Loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a =0,b=0;
         while(true){
        System.out.println("1. Enter two integers");
        System.out.println("2. Calculate sum of two given integers");
        System.out.println("3. Calculate subtraction of two given integers");
        System.out.println("4. Calculate multiply of two given integers");
        System.out.println("5. Calculate division of two given integers");
        System.out.println("6. Exit");
        System.out.print("Enter your choice : ");
        int choice=sc.nextInt();
       
       
            switch (choice){
                case 1 :
                    System.out.println("Enter two integers : ");
                    a =sc.nextInt();
                    b= sc.nextInt();
                    break;
                case 2 : 
                    System.out.println("Sum : "+(a+b));
                    break;
                case 3 :
                    System.out.println("Sub : "+(a-b));
                    break;
                case 4:
                    System.out.println("Mul : "+a*b);
                    break;
                case 5 :
                    System.out.println("Div : "+a/b);
                    break;
                case 6 :
                    System.exit(0);
            }
        }
    }
}
