/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class checkID {
    
   static Scanner sc=new Scanner(System.in);
    public static boolean check(String id ){
        for(Brand x : QLSP.listBr){
            if(x.getBrandID().equals(id)){
                return false;   
            }             
        }
        return true;
    }
    public static boolean check1(String id){
        if(!id.trim().equals("")){
            return true;
        }
        else return false;
    }
    public static String getID(){
        while(true){
            try{
            System.out.print("Enter the brandID : ");
            String id= sc.nextLine();
            if(check1(id)==true ){
                if(check(id)==true){
                return id;
                }else throw new IllegalAccessError();
            }
            else throw new AbstractMethodError();             
            }catch(IllegalAccessError e){
                System.out.println("Trùng rồi!!!");
            }catch(AbstractMethodError e){
                System.out.println("Không được để trống !!!");
            }catch(Exception e){
                System.out.println("Sai rồi !!!");
            }
        }
    } 
    //=============================================
     public static String getBrandName(){
        while(true){
            try{
            System.out.print("Enter the Brand name : ");
            String brand= sc.nextLine();
            if(!brand.trim().equals("")){
                return brand;
            }else throw new AbstractMethodError();
             
            }catch(AbstractMethodError e){
                System.out.println("Không được để trống !!!");
            }
            catch(Exception e){
                System.out.println("Sai rồi !!!");
            }
        }
    }
   //====================================================
     public static String getsoundBrand(){
         while(true){
            try{
            System.out.print("Enter the sound brand : ");
            String brand= sc.nextLine();
            if(!brand.trim().equals("")){
                return brand;
            }else throw new AbstractMethodError();
             
            }catch(AbstractMethodError e){
                System.out.println("Không được để trống !!!");
            }
            catch(Exception e){
                System.out.println("Sai rồi !!!");
            }
        }
     }
     //====================================================
    public  static float getPrice(){
        while (true){
            try{
                System.out.println("Enter the price");                
                return Float.parseFloat(sc.nextLine());
            }catch (Exception e){
                System.out.println("Sai rồi !!! ");
            }
        }
    }
    
}
