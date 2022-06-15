
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
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n>=10 && n <=20){
            for(int i=0;i<n;i++){
                for(int j=0 ;j <n;j++){
                    if(i>j){
                    System.out.print("*");
                }
                }
                System.out.println("");
            }
        }
    }
}
