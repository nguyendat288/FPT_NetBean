
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Inputter {

    public static Scanner sc = new Scanner(System.in);

    public static int inputInt(String msg, int min, int max) {
        if (min > max) {
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do {
            System.out.println(msg);
            data = Integer.parseInt(sc.nextLine());
        } while (data < min || data > max);
        return data;
    }

    public static String inputStr(String msg) {
        System.out.println(msg);
        String data = sc.nextLine().trim();
        return data;
    }

    public static String inputNonBlanhkStr(String msg) {
        String data;
        do {
            System.out.println(msg);
            data = sc.nextLine().trim();

        } while (data.length() == 0);
        return data;
    }

    public static String inputPattern(String code) {
        String pt ="[sS][\\d]{3}";
        if()
    }
}
