
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
public class Price extends Exception{
    static Scanner sc=new Scanner(System.in);
    public static int getPrice(){
        while (true){
            try{
                System.out.println("Nhập giá ");
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai cmnr ");
            }
        }
    }
}
