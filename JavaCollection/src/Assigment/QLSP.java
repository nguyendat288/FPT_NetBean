/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class QLSP {
   static Scanner sc = new Scanner(System.in);
   static ArrayList<Brand> listBr =readFromFile("brands.txt");
    
    public static ArrayList readFromFile(String file) {
        ArrayList list = new ArrayList();        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(st, ",:");
                int numberOfToken = str.countTokens();
                String arrST[] = new String[numberOfToken];
                int index = 0;
                while (str.hasMoreTokens()) {
                    String temp = str.nextToken().trim();
                    arrST[index++] = temp;
                }              
                list.add(new Brand(arrST[0], arrST[1], arrST[2], Float.parseFloat(arrST[3])));               
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeToFile(String file) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Brand p : listBr) {
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }
    //===========================================================================
//       1-	List all brands

    public static void displayBrands() {
        for (Brand a : listBr) {
            System.out.println(a);
        }
    }

//2-	Add a new brand
    public static void addBrand() {
        listBr.add(new Brand(checkID.getID().trim(), checkID.getBrandName(), checkID.getsoundBrand(), checkID.getPrice()));
    }

//3-	Search a brand based on its ID
    public static void search() {
        System.out.println("Enter Brand id you want to find : ");
        String id = sc.nextLine();
        int index = -1;
        for (Brand a : listBr) {
            if (a.getBrandID().equals(id)) {
                System.out.println(a);
                index = 1;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }
    }
//4-	Update a brand

    public static void updateBrand() {
        System.out.println("Enter Brand id you want to update : ");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < listBr.size(); i++) {
            if (listBr.get(i).getBrandID().equals(id)) {
                index = i;
                System.out.println("Enter the information you want to update : ");
                listBr.set(i, new Brand(checkID.getID(), checkID.getBrandName(), checkID.getsoundBrand(), checkID.getPrice()));
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }
    }
//5-	Save brands to the file, named brands.txt

    public static void save(String file) throws IOException {
        writeToFile(file);
    }

    public static void sort() {
        Collections.sort(listBr, new Comparator<Brand>() {
            @Override
            public int compare(Brand sv1, Brand sv2) {
                return (sv1.getBrandID().compareTo(sv2.getBrandID()));
                // Muốn đảo danh sách các bạn đối thành sv1 với sv2 đổi chỗ               
            }
        });
    }
}
