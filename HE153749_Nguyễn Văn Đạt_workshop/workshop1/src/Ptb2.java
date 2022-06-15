
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
public class Ptb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c ;
        System.out.print("Enter the a : ");
        a=sc.nextFloat();
        System.out.print("Enter the b : ");
        b=sc.nextFloat();
        System.out.print("Enter the c : ");
        c=sc.nextFloat();
        if(a == 0 && b == 0 ){
            if(c !=0){
                System.out.println("Equation has no root.");
            }else System.out.println("Equation has uncountable root.");
        } else {
            float delta = b*b-4*a*c;
            float d = (float) Math.sqrt(delta);
            if(delta>0){
                System.out.println("x1 ="+((-b+d)/(2*a))+"x2="+((-b-d)/(2*a)));
            }else if(delta ==0) {
                System.out.println("x = "+(-b/(2*a)));
            }
            else System.out.println("Equation has no root.");
        }
    }
}
