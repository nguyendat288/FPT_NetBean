/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Admin
 */
public class ChoiCondition {
    Scanner sc= new Scanner(System.in);
    public int getChoise(){
        while(true){
            try{
                System.out.print("Nhập lựa chọn của bạn :  ");
                return Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Sai định dạng rồi !!!");
            }
        }
    }
}
