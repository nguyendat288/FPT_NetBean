
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
public class Loop3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter the number : ");
    a = sc.nextInt();
    System.out.print("Các số hoàn hảo là : ");
    for(int j =1;j<=a;j++){
       int sum=0;
    for(int i=1;i<j;i++){
        if(j%i==0){
            sum+=i;
        }
        if(sum==j){
            System.out.print(j+" ");
            break;
        }
    }
    }
    }
    }
