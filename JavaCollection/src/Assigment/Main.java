/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ChoiCondition cc = new ChoiCondition();
        
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("|-----------Chương trình quản lý ô tô   --------------|");
            System.out.println("| 1.List all brands                                   |");
            System.out.println("| 2.Add a new brand                                   |");
            System.out.println("| 3.Search a brand based on its ID                    |");
            System.out.println("| 4.Update a brand                                    |");
            System.out.println("| 5.Save brands to the file, named brands.txt         |");
            System.out.println("| 6.List all cars in ascending order of brand names   |");
            System.out.println("| 7.List cars based on a part of an input brand name  |");
            System.out.println("| 8.Add a car                                         |");
            System.out.println("| 9.Remove a car based on its ID                      |");
            System.out.println("| 10.Update a car based on its ID                     |");
            System.out.println("| 11.List all car                                     |");
            System.out.println("| 12.Save cars to file, named cars.txt                |");
            System.out.println("| 13.Exit                                             |");
            System.out.println("|=====================================================|");
            int choice = cc.getChoise();
            switch (choice) {
                case 1:
                    QLSP.displayBrands();
                    break;
                case 2:
                    QLSP.addBrand();
                    break;
                case 3:
                    QLSP.search();
                    break;
                case 4:
                    QLSP.updateBrand();
                    break;
                case 5:

                    try {
                        QLSP.save("brands.txt");
                    } catch (Exception ex) {
                    ex.printStackTrace();
                    }
                    break;
                case 6:
                    CarList.sort();
                    break;
                case 7:
                    CarList.searchCar();
                    break;
                case 8:
                    CarList.addCar();
                    break;
                case 9:
                    CarList.remove();
                    break;
                case 10:
                    CarList.updateCar();
                    break;
                case 11:
                    CarList.display();
                    break;
                case 12:
                    try {
                        CarList.save("car.txt");
                    } catch (Exception e) {
                       e.printStackTrace();
                    }
                    break;
                case 13:
                    System.exit(0);
            }
        }
    }
}
