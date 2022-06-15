
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ID extends Exception{
     static Scanner sc = new Scanner(System.in);

    public static boolean checkID(int id) {
        for (SanPham x : QLSP.list) {
            if (x.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public static int getId() {
        while (true) {
            try {
                System.out.print("nhập id :");
                int id = Integer.parseInt(sc.nextLine());
                if (checkID(id) == true) {
                    return id;
                } else throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("Trùng cmnr");
            } catch (Exception e) {
                System.out.println("sai cmnr");
            }
        }
    }
    
}
    