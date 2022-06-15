/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import static test.WordCount.str;

/**
 *
 * @author Admin
 */
public class Dictionnary {
        static Hashtable<String,String> list=new Hashtable<String,String>();
       static String str;
public static void readFromFile(String file){
        try{
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
           String st;
            while((st=bufferedReader.readLine())!=null){
            str=st;
        }
        }catch(FileNotFoundException e){
            e.printStackTrace(); 
        }catch(IOException e){
            e.printStackTrace();       
        }
    }
public static String lookup(String str2){
        
    readFromFile("abcd.txt");
    String arr[]=str.split(",");
    for(int i=0;i<arr.length;i++){
        list.put(arr[i].trim(),arr[i+1]);
        i++;
    }
     Enumeration<String> enumeration = list.keys();
     while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            if(key.equals(str2)){
            return key +": "+list.get(key);
        }
    }
     return "not found";
}
    public static void main(String[] args) {     
        Scanner sc =new Scanner(System.in);
        System.out.print("NHập từ tiếng anh cần đổi sang tiếng việt :");
        String str1=sc.nextLine();
        System.out.println(lookup(str1));
       
    }
//      public String lookup(String word) {
//        Enumeration<String> enumerations = this.keys();
//        while (enumerations.hasMoreElements()) {
//            String nextElement = enumerations.nextElement();
//            if(nextElement.equalsIgnoreCase(word)){
//                return this.get(nextElement);
//            }
//        }
//        return "not found";
//    }

}