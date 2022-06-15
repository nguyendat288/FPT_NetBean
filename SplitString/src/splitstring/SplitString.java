/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitstring;

/**
 *
 * @author Admin
 */
public class SplitString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st = "SE1111;Nguyen van hoang; Ha noi;HoangNv@fpt.edu.vn";
        // split : tách chuỗi sau kí tự
        String arrST[]=st.split("");
        for(String a : arrST){
            System.out.println(a);
        }
        
        
    }
    
}
