
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
public class Multiplying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String choice;
        System.out.print("Enter the number : ");
        a=sc.nextInt();
        System.out.print("Enter the (A,B,C) : ");
        sc.nextLine();
        choice =sc.nextLine();
        switch(choice){
            case "A" :
                System.out.println(a*10);
                 break;
            case "B" :
                System.out.println(a*100);
                break;
            case "C" :
                System.out.println(a*1000);
                    
        }
    }
}
