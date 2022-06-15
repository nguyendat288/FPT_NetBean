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
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class WordCount {
    
  static Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>(); 
    static String str;
  
    public static void readFromFile(String file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                str = st;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFromFile("abc.txt");
        WordCount c= new WordCount();
         StringTokenizer token = new StringTokenizer(str, " ");
         System.out.println(c.count(token));
    }
    public  int count(StringTokenizer token){     
    int total = 0;
        while (token.hasMoreTokens()) {
            String word = token.nextToken();
//            hashtable.put(word, hashtable.containsKey(word)? hashtable.get(word)+1 :1);
            if (!hashtable.containsKey(word)) {
                hashtable.put(word, 1);
            } else {
                hashtable.put(word, hashtable.get(word) + 1);
            }
            total += 1;
        }
        Enumeration<String> enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            System.out.println(key + " " + hashtable.get(key));
        }
        return total;
//        hashtable.forEach((key,value)-> System.out.println(key + " "+ value));
    }
    
}
