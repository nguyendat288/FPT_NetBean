/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitstring;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class TokenString {
    public static void main(String[] args) {
        String st = "SE1111;Nguyen van hoang; Ha noi;HoangNv@fpt.edu.vn";
        StringTokenizer stk = new StringTokenizer(st,";,");
        int numberOfToken = stk.countTokens();
        String arrST[]=new String[numberOfToken];
        int index=0;
        while(stk.hasMoreTokens()){
            String temp=stk.nextToken();
            arrST[index++]=temp;
//            System.out.println(temp);      
        }
        for(String a : arrST){
            System.out.println(a);
        }
//        System.out.println(numberOfToken);
//        
//        
//        
//        String word = "SE1111 Nguyen van hoang Ha noi HoangNv@fpt.edu.vn";
//  StringTokenizer stk1= new StringTokenizer(word);
//          int numberOfToken1 = stk1.countTokens();
//        System.out.println(numberOfToken1);
//        
//        //================================
//        //get token
//        String express = "a+b-c*d/e";
//        StringTokenizer stk2 = new StringTokenizer(express,"+-*/",true);
//        while(stk2.hasMoreTokens()){
//            System.out.println(stk2.nextToken());
//        }
        //==================================
        
    }
}
