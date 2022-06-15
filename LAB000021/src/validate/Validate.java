/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import controller.Manager;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validate {

    static Scanner sc = new Scanner(System.in);
    Manager mn = new Manager();

    public String getId() {
        while (true) {
            try {
                System.out.print("Enter the id : ");
                String id = sc.nextLine();
                if (check1(id) == true) {
                    if (mn.checkID(id) == true) {
                        return id;
                    } else {
                        throw new IllegalAccessError();
                    }
                } else {
                    throw new AbstractMethodError();
                }
            } catch (IllegalAccessError e) {
                System.out.println("Trùng id rồi !!!");
            } catch (AbstractMethodError e) {
                System.out.println("Không để trống !!!");

            } catch (Exception e) {
                System.out.println("Lỗi ròi !!!");
            }
        }
    }

    public String getName() {
        while (true) {
            try {
                String name = sc.nextLine();
                if (name.trim().length() != 0) {
                    return name;
                } else {
                    throw new Error();
                }
            } catch (Error e) {
                System.out.println("Not Empty !!! ");
                System.out.print("Re-input : ");
            } catch (Exception e) {
                System.out.println("Error !!!");
                System.out.print("Re-input : ");
            }
        }
    }

    //
    public boolean check1(String id) {
        if (!id.trim().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public String getCouseName() {
        while (true) {
            try {
                System.out.println("Enter the couse name : ");
                String name = sc.nextLine();
                if (name.trim().length() != 0) {
                    if (name.equals("Java") || name.equals(".Net") || name.equals("C++") || name.equals("C")) {
                        return name;
                    } else {
                        throw new AbstractMethodError();
                    }
                } else {
                    throw new Error();
                }

            } catch (AbstractMethodError e) {
                System.out.println("Phải là 1 trong 4 : Java , .Net , C++ , C !!! ");
            } catch (Error e) {
                System.out.println("Not empty  !!!");
            } catch (Exception e) {
                System.out.println("Error !!!");

            }
        }
    }
}
