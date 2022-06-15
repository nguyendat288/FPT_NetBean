
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
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance : ");
        float a;
        a =sc.nextFloat();
       if(a >0 && a <=99){
           System.out.println("Cost : " + a*5.00);
       }else if (a <=299)
            System.out.println("Cost : "+(99*5.00+(a-99)* 8.00));
       else if (a <=599)
            System.out.println("Cost : "+ (99*5.00+200*8.00+(a-299)*10.00));
       else if (a <=999)
            System.out.println("Cost : "+ (99*5.00+200*8.00+300*10.00+(a-599)*12.00));
    }

}
