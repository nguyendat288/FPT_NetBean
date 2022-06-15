package check;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Checknumber {
    public static void main(String[] args) {
        
   
        String st="abc 12 xd 78 cd 19";
        String arr[]=st.split(" ");
        int sum=0;
        for(int i=0;i<arr.length;i++){
              try{
                  sum+=Integer.parseInt(arr[i]);
              }catch(NumberFormatException e){
               System.out.println("Xuất hiện ký tự dạng chuỗi");
              }catch(Exception e){
                  e.printStackTrace();
              }
        }
        System.out.println("Sum = "+sum);
    }
}
