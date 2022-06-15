/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import model.Student;
import validate.Validate;

/**
 *
 * @author Admin
 */
public class Manager {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Student> list = new ArrayList();
    Validate validate=new Validate();
//     id, studentName, semester and courseName
    public int add(String id,String name,String semester,String couseName){       
        list.add(new Student(id, name, semester, couseName));
        return 1;
    }
//    2.	Find/Sort: Find and list student (by name) and sort by name,
//            it should display: Student name, semester and Course Name. User inputs student name or a part of student name.
    public ArrayList<Student> find(String name){
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.print("Enter name to search: ");
        for (Student student : list) {
            // Kiểm tra có student nào hợp lệ
            if (student.getName().contains(name)) {
                listStudentFindByName.add(student);
            }
        }
        return listStudentFindByName;
    }
     public ArrayList<Student> sort(String name){
         ArrayList<Student> list1=find(name);
          Collections.sort(list1, new Comparator<Student>() {
                @Override
                public int compare(Student t, Student t1) {
                    return t.getName().compareTo(t1.getName());
                }
            });  
          return list1;
     }
    //3.	Update/Delete: The program allows user find a student by ID
     public void update(String id ){
        int index =-1;
        for(int i =0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                System.out.println("id : ");
        String id1 =sc.nextLine();
        System.out.println("Name  : ");
        String name= sc.nextLine();
        System.out.println("Semester : ");
        String semester = sc.nextLine();
        System.out.println("Couse Name : ");
        String couseName= sc.nextLine();
             list.set(i, new Student(id1, name, semester, couseName));
             index=i;
            }
        }
       
     }
     
     //check id
     public  boolean checkID(String id ){
         for(int i =0;i<list.size();i++){
             if(list.get(i).getId().equals(id)){
                 return false;
             }
         }
         return true;
     } 
}
