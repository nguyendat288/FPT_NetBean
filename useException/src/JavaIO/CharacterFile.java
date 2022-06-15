/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CharacterFile {
    public void readFromFile(String file){
        try{
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String st;
            while((st=bufferedReader.readLine())!=null){
           
            System.out.println(st);
        }
        }catch(FileNotFoundException e){
            e.printStackTrace(); 
        }catch(IOException e){
            e.printStackTrace();       
        }
    }
    public static void main(String[] args) {
    CharacterFile obj =new CharacterFile();
       obj.readFromFile("abc.txt");
    obj.writeToFile("abc.txt", true,"Thầy đz số 2 không ai chủ nhật");
    }
    
    public void writeToFile(String file,boolean  append,String value){
        BufferedWriter bufferedWriter=null;
        try{
             bufferedWriter= new BufferedWriter(new FileWriter(file,append));
            bufferedWriter.write(value);
            bufferedWriter.newLine();
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
       finally{
            try {
                bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(CharacterFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
