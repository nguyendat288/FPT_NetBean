/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Part3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Nhập số học sinh : ");
        n = sc.nextInt();
        String[] list = new String[n];
        sc.nextLine();
        for(int i=0;i<list.length;i++){
            System.out.print("Enter the name student "+(i+1)+" :");
            list[i]=sc.nextLine();
        }
        System.out.println("The list student : ");
        for(String a : list){
            System.out.println(a.toUpperCase());
        }
    }
}
