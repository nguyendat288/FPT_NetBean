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
public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
      String str;
        System.out.print("Input the number 1 : ");
        a = sc.nextFloat();
        System.out.print("Input the number 2 : ");
        b = sc.nextFloat();
          str = sc.nextLine();
        System.out.println("Input the operator (+-*/) : ");
        str = sc.nextLine();
        if(str.equals("+"))
            System.out.println("The result of "+a + str +b +"="+(a+b));
        else if(str.equals("-"))
            System.out.println("The result of "+a + str +b +"="+(a-b));
         else if(str.equals("*"))
            System.out.println("The result of "+a + str +b +"="+(a*b));
            else if(str.equals("/"))
            System.out.println("The result of "+a + str +b +"="+(a/b));
            else
                System.out.println("No avaiable");
    }
}
