/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0011;

/**
 *
 * @author Admin
 */
public class Manager {
        //display menu
    public static int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInput(1, 4);
        return choice;
    }
    public static int convert
}
