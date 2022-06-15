
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class StudentList extends ArrayList<Student>{
    public StudentList() {
        super();
    }
    public Student search(String code){
        code=code.trim().toUpperCase();
        for(int i=0;i<this.size();i++){
            if(this.get(i).equals(code)){
                return  this.get(i);
            }
        }
        return null;
    }
    public boolean isCodeDupplicated(String code){
        code=code.trim().toUpperCase();
        return search(code)!=null;
    }
    
    //===========================================================
    public void addStudent(){
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        do {
            newCode = Inputter.inputPattern("St. code S000","[sS] [\\d]{3}");
             newCode=newCode.trim().toUpperCase();
             codeDuplicated=isCodeDupplicated(newCode);
             if(codeDuplicated)
                 System.out.println("Code is duplicated!");
        }while (codeDuplicated==true);
    newName=Inputter.inputNonBlanhkStr("Name of new student : ");
    newName=newName.toUpperCase();
    newMark =Inputter.inputInt("Mark : ", 0, 10);
    Student st =new Student(newCode, newName, newMark);
    this.add(st);
        System.out.println("Student "+newCode+" has been added");
    }
    //=============================================================
    public void searchStudent(){
        if(this.isEmpty()){
            System.out.println("Empty list. No search can be performed !");            
        }else {
            String sCode =Inputter.inputStr("input student code for search : ");
            Student st = this.search(sCode);
            if(st==null){
                System.out.println("Student :  "+sCode +"doesn't exist !");
            }
            else System.out.println("Fount : "+st );
        }
    }
   //===================================================================
    public void updateStudent(){
        if(this.isEmpty()){
            System.out.println("List empty !!!");
        }else{
            String uCode = Inputter.inputStr("Input code of update student : ");
            Student st = this.search(uCode);
            if(st == null){
                System.out.println("Student : "+uCode +" doesn't exist ");
                
            }else{
                String oldName = st.getName();
                String msg = "Old name : "+oldName+", new name : ";
                String newName = Inputter.inputNonBlanhkStr(msg);
                st.setName(newName);
            int oldMark = st.getMark();
            msg = "Old mark : "+oldMark +", new mark : ";
            int newMark =Inputter.inputInt(msg,0,10);            
            st.setMark(newMark);
                System.out.println("Student : "+uCode+"has been update ");
            }
        }
    }
    public  void removeStudent(){
        if(this.isEmpty()){
            System.out.println("List Empty ");
        }else{
            String rCode = Inputter.inputStr("Input code of removed student : ");
            Student st = this.search(rCode);
            if(st==null){
                System.out.println("Student : "+rCode +"doesn't existed");
                
            }else{
                this.remove(st);
                System.out.println("Student : "+rCode+"has been removed ");
            }
        }
    }
    public void printAll(){
        if(this.isEmpty()){
            System.out.println("Empty list !");
        }else {
            System.out.println("Student List : ");
            for(Student a: this){
                System.out.println(a);
            }
            System.out.println("Total "+this.size()+" student(s).");
        }
    }
}
  