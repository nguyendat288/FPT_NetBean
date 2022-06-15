/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Admin
 */
public class ThrowVSThrows {
    public void readFromFile(String fileName){
      int a =10,b=0;
      int c=a/0;
        try{
          FileReader file = new FileReader(fileName);
      }catch(FileNotFoundException e){
          e.printStackTrace();
      }
    }
public void readFile(String fileName){
  try{
      FileInputStream file = new FileInputStream(fileName);
      int n=file.read();
  }  catch(FileNotFoundException e){
      e.printStackTrace();
  }catch(IOException e){
      e.printStackTrace();
  }
}
public void throwDemo(){
    double x=10,y=0;
    if(y==0) throw new ArithmeticException("Lỗi chia cho 0 ");
    double z=x/y;
    System.out.println("z="+z);
}
public void throwsDemo() throws FileNotFoundException{
    FileInputStream file=new FileInputStream("abc.txt");
}
    public static void main(String[] args) {
        ThrowVSThrows obj=new ThrowVSThrows();
        obj.throwDemo();
        obj.readFile("abc.txt");
        obj.throwDemo();
    }

            }
