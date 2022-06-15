/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Task;
import validate.Validate;


/**
 *
 * @author Admin
 */
public class Manager {
     static Scanner sc = new Scanner(System.in);
     ArrayList<Task> list = new ArrayList();
     Validate validate= new Validate();
     public void main(){
         while(true){
             System.out.println("1. Add");
             System.out.println("2. Delete");
             System.out.println("3. Display");
             System.out.println("4. Exit");
             System.out.println("Enter your choice : ");
             int choice = validate.checkIntLimit(1, 4);
             switch(choice){
                 case 1 : 
                    
                     System.out.println("Name : ");
                     String name = validate.checkInputStr();
                     System.out.println("Task type id : ");
                     int type = validate.checkIntLimit(1, 4);
                     System.out.println("date : ");
                     String date = validate.checkInputDate();
                     System.out.println("form : ");
                     String form = validate.checkInputPlan();
                     System.out.println("to : ");
                     String to = validate.checkInputPlan();
                     System.out.println("Assginee : ");
                     String assginee = validate.checkInputStr();
                     System.out.println("Reviewer : ");
                     String reviewer = validate.checkInputStr();
                    addTask(type, name, date, form, to,assginee, reviewer);
                    break;
                 case 2 :
                     delete();
                     break;
                 case 3 :
                     display();
                     break;
                 case 4 :
                     System.exit(100);
             }
         }
     }
    
    public void addTask(int TaskTypeID,String name,String date,String form, String to,String assignee,String reviewer){
         int id = list.size()+1;
        String type = validate.checkTypeID(TaskTypeID);
        list.add(new Task(id, name, type, date, form, to, assignee, reviewer));
    }
    public void delete(){
        int index =-1;
        System.out.println("Enter the id : ");
        int id = validate.checkInputInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                index=i;
                list.remove(i);
                System.out.println("Done !!!");
                return ;
            }
        }
        if(index ==-1){
            System.out.println("Doesn't exist !!!");
        }
    }
    public void display(){
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n ","ID","Name","Task Type","Date","Time","Assginee","Reviewer");
    for(int i =0;i<list.size();i++){
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n ",
                list.get(i).getId(),
                list.get(i).getName(),
                list.get(i).getTaskType(),
                list.get(i).getDate(),
                Double.parseDouble(list.get(i).getPlanTo())- Double.parseDouble(list.get(i).getPlanForm()),
                list.get(i).getAssginee(),
                list.get(i).getReviewer());
    }
    }
    public static void main(String[] args) {
        Manager mn = new Manager();
        mn.main();
    }
}
