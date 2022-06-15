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
public class checkCar {


    static Scanner sc = new Scanner(System.in);

    public static boolean check(String id) {
        for (Car x : CarList.listCar) {
            if (x.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
   public static boolean check1(String id){
        if(!id.trim().equals("")){
            return true;
        }
        else return false;
    }
    public static String getID(){
        while(true){
            try{
            System.out.print("Enter the Car id : ");
            String id= sc.nextLine();
            if(check1(id)==true ){
                if(check(id)==true){
                return id;
                }else throw new IllegalAccessError();
            }
            else throw new AbstractMethodError();             
            }catch(IllegalAccessError e){
                System.out.println("Trùng rồi!!!");
            }catch(AbstractMethodError e){
                System.out.println("Không được để trống !!!");
            }catch(Exception e){
                System.out.println("Sai rồi !!!");
            }
        }
    }
    //============================================================

    public static boolean checkBrandID(String id) {
        for (Brand x : QLSP.listBr) {
            if (x.getBrandID().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static Brand getBrand() {
        while (true) {
            try {
                System.out.print("Enter the brand id : ");
                String id = sc.nextLine();
                if(check1(id)==true ){
                if(checkBrandID(id)==true){
                return new  Brand(id);
                }else throw new IllegalAccessError();
            }
            else throw new AbstractMethodError();             
            }catch(IllegalAccessError e){
                System.out.println("Không tồn tại !!!");
            }catch(AbstractMethodError e){
                System.out.println("Không được để trống !!!");
            }catch(Exception e){
                System.out.println("Sai rồi !!!");
            }
        }
    }

    //==================================================
    public static String getColor() {
        while (true) {
            try {
                System.out.print("Enter the color : ");
                String color = sc.nextLine();
                if (!color.trim().equals("")) {
                    return color;
                } else {
                    throw new AbstractMethodError();
                }
            } catch (AbstractMethodError e) {
                System.out.println("Not empty !!!");
            } catch (Exception e) {
                System.out.println("Error !!!");
            }
        }
    }

//      private String frameID;
//    private String engineID;
    public static boolean checkFrameID(String str) {
        String st = "^F[0-9]{5}$";
        if (str.matches(st)) {
           return true;
        } else {
            return false;
        }
    }

    public static boolean checkFrameID1(String str) {
        for (Car x : CarList.listCar) {
            if (x.getFrameID().trim().equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static String getFramID() {
        while (true) {
            try {
                System.out.print("Enter the frame id : ");
                String str = sc.nextLine();
                if (checkFrameID(str) == true) {                    
                 if (checkFrameID1(str) == true) {
                     return str;
                 }else
                    throw new AbstractMethodError();
                } else {
                    throw new IllegalAccessError();
                }
            } catch (IllegalAccessError e) {
                System.out.println("Không đúng form rồi !!!");
                System.out.println("Form : Fxxxxx (x là số)");
            } catch (AbstractMethodError e) {
                System.out.println("Trùng rồi !!!");
            } catch (Exception e) {
                System.out.println("Sai form rồi !!!");
            }
        }
    }
    //===============================================================

    public static boolean checkEngineID(String str) {
        String st = "^E[0-9]{5}$";
        if (str.matches(st)) {
                return true;
        } else {
            return false;
        }
    }

    public static boolean checkEngineID1(String str) {
        for (Car x : CarList.listCar) {
            if (x.getEngineID().trim().equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static String getEngineID() {
        while (true) {
            try {
                System.out.print("Enter the engine id : ");
                String str = sc.nextLine();
                if (checkEngineID(str) == true) {
                  
               if (checkEngineID1(str) == true) {
                     return str;
               }else
                    throw new AbstractMethodError();
                } else {
                    throw new IllegalAccessError();
                }
            } catch (IllegalAccessError e) {
                System.out.println("Không đúng form rồi !!!");
                  System.out.println("Form : Exxxxx (x là số)");

            } catch (AbstractMethodError e) {
                System.out.println("Trùng rồi !!!");
            } catch (Exception e) {
                System.out.println("Sai form rồi !!!");
            }
        }
    }
}
