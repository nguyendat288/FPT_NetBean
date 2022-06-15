
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
public class Soluong {
     static Scanner sc=new Scanner(System.in);
    public static int getSoluong(){
        while (true){
            try{
                System.out.print("Nhập số lượng ");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai cmnr ");
            }
        }
    }
}
