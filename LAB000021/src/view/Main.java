/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manager;
import java.util.Scanner;
import validate.Validate;

/**
 *
 * @author Admin
 */
public class Main {
    Manager manager = new Manager();
    Scanner sc = new Scanner(System.in);
    Validate validate= new Validate();
    public static void main(String[] args) {
    Main main = new Main();
    main.display();    
    }
    public void display(){
          while(true){
            System.out.println("1. Add ");
            System.out.println("2. Find and Sort");
            System.out.println("3.Update/Delete");
            System.out.println("4.Report");
            System.out.println("5.Display");
            System.out.println("6. Exist ");
            
        }
    }
    public void addSt(){
        while(true){
        if(manager.list.size()>=10){
            System.out.println("Do you want to continue ? Y/N");
            String check=sc.nextLine();
            if(check.equals("Y")){
              break;
            }else if(check.equals("N")){
                return;
            }else{
                System.out.println("Sai định dạng !!!!");
                continue;
            }
        }else break;
       }
        System.out.println("id : ");
        String id =validate.getId();
        System.out.println("Name  : ");
        String name= validate.getName();
        System.out.println("Semester : ");
        String semester = validate.getName();
        String couseName= validate.getCouseName();
        manager.add(id,name,semester,couseName);
    }
}
