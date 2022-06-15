/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BinaryFile {
    public void readFile(String file){
        BufferedInputStream bin=null;
        try{
            bin=new BufferedInputStream(new FileInputStream(file));
            int n=0;
            while((n=bin.read())!=-1){
                System.out.println((char)n);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                bin.close();
            } catch (IOException ex) {
                Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void writeToFile(String file,boolean append,String value){
    BufferedOutputStream bout = null;
    try{
        bout=new BufferedOutputStream(new FileOutputStream(file,append));
        bout.write(value.getBytes());
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
       e.printStackTrace();
    }finally{
        try {
            bout.close();
        } catch (IOException ex) {
            Logger.getLogger(BinaryFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}
