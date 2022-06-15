/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EBank ebank = new EBank();
        int choice;

        do {
            System.out.println("----------Login Program----------");
            System.out.println("1. Vietnamese");
            System.out.println("2. English");
            System.out.println("3. Exit");
            System.out.print("Please choice one option:");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1:
                ebank.setLocale(new Locale("vietnam"));
                ebank.input();
                break;
            case 2:
                ebank.setLocale(new Locale("en"));
                ebank.input();
                break;
            case 3:
                System.out.println("Tam Biet/Goodbye (ʘ‿ʘ)╯");
                break;
        }

    }
}
