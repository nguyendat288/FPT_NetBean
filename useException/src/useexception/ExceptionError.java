/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExceptionError {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("a=");a=sc.nextInt();
        System.out.println("b=");b=sc.nextInt();
        c=a/b;
        System.out.println("c="+c);
        }
//        catch(ArithmeticException e){
//            //display exception name
//            System.out.println(e.toString());
//            //display exception detail--> debug
//            e.printStackTrace();
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//        }
catch(Exception e){
    System.out.println("Lỗi rồi bố ạ ");
    e.printStackTrace();
}
        finally{
            System.out.println("alway run ");
        }
         System.out.println("program continue..");
    }
}
