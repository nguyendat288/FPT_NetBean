
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
public class Electrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of electricity consumed : ");
        int a;
        a = sc.nextInt();
        if(a>0 && a <=100){
            System.out.println("Amount you need to pay : "+ a*600);
        } else if (a<=150){
            
                        System.out.println("Amount you need to pay : "+ (100*600+(a-100)*900));
        }else if (a<=200 ){
            
                        System.out.println("Amount you need to pay : "+(100*600+ 50*900+(a-150)*1200));
        }else if (a<=300){
                        System.out.println("Amount you need to pay : "+ (100*600+ 50*900+50*1200+(a-200)*1500));
        }else System.out.println("Amount you need to pay : "+(100*600+ 50*900+50*1200+100*1500+((a-300)* 2000)));
    }
}
