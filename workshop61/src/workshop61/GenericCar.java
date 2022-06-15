/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop61;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GenericCar {
    static Scanner sc= new Scanner(System.in);
   static List<Car> list =new ArrayList<Car>();
   
//    this.name = name;
//        this.price = price;
//        this.production = production;
   public static void addCar(){
       System.out.print("Enter the name : ");
       String name =sc.nextLine();
       System.out.print("Enter the price : ");
       int price =sc.nextInt();
       sc.nextLine();
       System.out.print("Enter the production : ");
       String production =sc.nextLine();
       list.add(new Car(name,price,production));
   }
   public static void display(){
       if(list.isEmpty()){
           System.out.println("List is Empty!");
       }
       for(Car a :list){
           System.out.println(a);
       }
   }
   public static void getSize(){
       System.out.println(list.size());
   }
   public static String checkEmpty(){
        if(list.isEmpty()){
          return "List is Empty";
       }else
           return "List is not Empty";  
   }
   public static void delete(){
         System.out.print("Chọn vị trí bạn muốn xoá trong danh sách : ");
         int a = sc.nextInt();
       list.remove(a);
   }
}
