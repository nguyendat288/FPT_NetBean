/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Item {
    protected  int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output(){
        System.out.println("Value = "+value);
        System.out.println("Creator = "+creator);
    }
    public void input(){
         Scanner sc= new Scanner(System.in);
         
     do{
         System.out.print("Enter the value : ");
        value = sc.nextInt();       
     }while(value<=0);
             
     do{
         System.out.print("Enter the creator : ");
         sc.nextLine();
         creator = sc.nextLine();       
     }while (creator.equals(""));
    }
}
