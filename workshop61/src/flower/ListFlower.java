/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class ListFlower {
     static Scanner sc= new Scanner(System.in);
   static List<Flower> list =new ArrayList<Flower>();
   
// String name ;
//    String price;
//    String color;

   public static void addFlower(){
       System.out.print("Nhập tên  : ");
       String name =sc.nextLine();
       System.out.print("Nhập giá : ");
       int price =sc.nextInt();
       sc.nextLine();
       System.out.print("Nhập màu : ");
       String color =sc.nextLine();
       list.add(new Flower(name,price,color));
   }
   public static void display(){
       if(list.isEmpty()){
           System.out.println("Danh sách trống");
       }
       for(Flower a :list){
           System.out.println(a);
       }
   }
   public static void sort(){
    Collections.sort(list, new Comparator<Flower>() {
            @Override
            public int compare(Flower sv1, Flower sv2) {
                if (sv1.price < sv2.price) {
                    return 1;
                } else {
                    if (sv1.price == sv2.price) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });   
   }
  public static String search(){
      System.out.print("Nhập tên hoa bạn muốn tìm : ");
      String a =sc.nextLine();
      for(Flower b :list){
          if(b.getName().equals(a)){
              return b.toString();
          }
      }
      return "không tìm thấy trong danh sách";
  }
  
   public static void delete(){
         System.out.print("Chọn vị trí bạn muốn xoá trong danh sách : ");
         int a = sc.nextInt();
       list.remove(a);
   }
}
