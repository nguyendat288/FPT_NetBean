/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Dictionary {
    String st1;
        public Dictionary() {
    }
public void readFromFile(String file){
        try{
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
           String st;
            while((st=bufferedReader.readLine())!=null){
            st1=st;
        }
        }catch(FileNotFoundException e){
            e.printStackTrace(); 
        }catch(IOException e){
            e.printStackTrace();       
        }
    }
public String lookup(String word){   
        readFromFile("abc.txt");
         String arrST[]=st1.split(",");
         for(int i=0;i<arrST.length;i++){
             if(word.equals(arrST[i])){
                 if(i%2==0){
                     return arrST[i+1];
                 }else return arrST[i-1];
             }
         }
         return "not found";
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Dictionary dictionary=new Dictionary();
         System.out.println("Nhập từ cần dịch : ");
         String word=sc.nextLine();
        System.out.println(dictionary.lookup(word));
    }
}
