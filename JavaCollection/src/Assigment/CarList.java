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

/**
 *
 * @author Admin
 */
public class CarList {
   static ArrayList<Car> listCar =readFromFile("car.txt");
  static  Scanner sc = new Scanner(System.in);  
   
    public static ArrayList readFromFile(String file) {
        ArrayList list = new ArrayList();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String st = "";
            while ((st = bufferedReader.readLine()) != null) {
                String[] arrST = st.split(",");
                if (arrST.length >= 4) {
                    list.add(new Car(arrST[0], new Brand(arrST[1]), arrST[2], arrST[3], arrST[4]));
                }
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
            FileWriter fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Car p : listCar) {
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
    //6-	List all cars in ascending order of brand names  
    public static void sort() {
        Collections.sort(listCar, new Comparator<Car>() {
            @Override
            public int compare(Car sv1, Car sv2) {
                return (sv1.getId().compareTo(sv2.getId()));
                // Muốn đảo danh sách các bạn đối thành sv1 với sv2 đổi chỗ               
            }
        });
    }
    //7-	List cars based on a part of an input brand name
    public static void display(){
        for(Car a : listCar){
            System.out.println(a);
        }
    }
    public static void searchCar() {
        System.out.print("Enter the brand car : ");
        String str = sc.nextLine();
        int index = -1;
        for (Brand x : QLSP.listBr) {
            if (x.getBrandName().contains(str)) {
                String st=x.getBrandID();
                for(Car a : listCar){
                    if(a.getBrandID().equals(st)){
                        System.out.println(a);
                    }
                }
            }
        }
        if (index == -1) {
            System.out.println("Not found !!!");
        }
    }
//8-	Add a car

    public static void addCar() {
//a.	Car ID can not be duplicated.// k được trùng
//b.	Brand ID must have existed and it must be inputted using a menu.// có trong Brand và phải nhập bằng tay 
//c.	Color can not be blank.//k trống
//d.	Frame ID can not be blank and must be in the  “F00000” format and can not be duplicated.// 
//không trống và phải theo định dạng ko trùng
//e.	Engine ID can not be blank and must be in the  “E00000” format and can not be duplicated.//k trống và định dạng ko trùng

        listCar.add(new Car(checkCar.getID(), checkCar.getBrand(), checkCar.getColor(), checkCar.getFramID(), checkCar.getEngineID()));

    }

//9-	Remove a car based on its ID
    public static void remove() {
        System.out.print("Enter car id you want to remove : ");
        String id = sc.nextLine();
        int index = -1;
        for(int i=0;i<listCar.size();i++){
            if(listCar.get(i).getId().trim().equals(id)){
                index=i;
                listCar.remove(i);
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }
    }

//10-	Update a car based on its ID
    public static void updateCar() {
        System.out.println("Enter Car id you want to update : ");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i).getId().equals(id)) {
                index = i;
                System.out.println("Enter the information you want to update : ");
                listCar.set(i, new Car(checkCar.getID(), checkCar.getBrand(), checkCar.getColor(), checkCar.getFramID(), checkCar.getEngineID()));
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }
    }
//11-	Save cars to file, named cars.txt
    public static void save(String file) throws IOException {
        writeToFile(file);
    }
}
