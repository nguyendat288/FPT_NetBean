/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Validate {
     static Scanner sc = new Scanner(System.in);
    static String plan_value = "^[0-9]{1,2}\\.5|[0-9]{1,2}\\.0$";

    public int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int x = Integer.parseInt(sc.nextLine());
                if (x >= min && x <= max) {
                    return x;
                } else {
                    throw new AbstractMethodError();
                }
            } catch (AbstractMethodError e) {
                System.out.println("Re - input : ");
            }catch(Exception e){
                System.out.println("Re - input : ");
            }
        }
    }

    public  String checkInputDate() {
        while (true) {
            try {
                String st = sc.nextLine().trim();
                SimpleDateFormat sp = new SimpleDateFormat("dd-MM-yyyy");
                Date date = sp.parse(st);
                if (st.equalsIgnoreCase(sp.format(date))) {
                    return st;
                } else {
                    throw new AbstractMethodError();
                }
            } catch (AbstractMethodError e) {
                System.out.println("Error format !!!");
                System.out.print("Re- input : ");
            } catch (ParseException e) {
                System.out.print("Re-input : ");
            }
        }
    }

    public  String checkInputStr() {
        while (true) {
            try {
                String str = sc.nextLine();
                if (str.trim().length() != 0) {
                    return str;
                } else {
                    throw new AbstractMethodError();
                }
            } catch (AbstractMethodError e) {
                System.out.println("Not empty !!!!");
                System.out.print("Re-input : ");
            } catch (Exception e) {
                System.out.println("Re-input : ");
            }
        }
    }

    public  int checkInputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Re-input : ");
            } catch (Exception e) {
                System.out.println("Re-input : ");
            }
        }
    }

    public  String checkTypeID(int id ) {
        while (true) {
            String x = null;
            switch (id) {
                case 1:
                    x = "Code";
                    break;
                case 2:
                    x = "Test";
                    break;
                case 3:
                    x = "Manager";
                    break;
                case 4:
                    x = "Learn";
                    break;
            }
            return x;
        }
    }

    public  String checkInputPlan() {
        while (true) {
            String plan = checkInputStr();
            if (plan.matches(plan_value) && Double.parseDouble(plan) >= 8.0 && Double.parseDouble(plan) <= 17.5) {
                return plan;
            } else {
                System.out.println("Re-input : ");
            }

        }
    }
}
