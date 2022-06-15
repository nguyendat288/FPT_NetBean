/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 *
 * @author Admin
 */
public class DemoMap {

    public static void main(String[] args) {

        String st = "dem tan suat xuat hien ky tu trong string";
        Hashtable hashtable = new Hashtable();
        for (int i = 0; i < st.length(); i++) {
            String key = st.charAt(i) + "";
            // key chưa tồn tại 
            if (!hashtable.containsKey(key)) {
                hashtable.put(key, 1);
            } else {
                int value = Integer.parseInt(hashtable.get(key).toString());
                hashtable.put(key, value + 1);
            }
        }
        //lấy lại cột key
        Enumeration enumeration=hashtable.keys();
        while(enumeration.hasMoreElements()){
            //get key
            String key= enumeration.nextElement().toString();
            //get value
            int value =Integer.parseInt(hashtable.get(key).toString());
            //display
            System.out.println(key +" "+value);
        }
    }
}
class ManagerProductByMap{
    Hashtable hashtable;
    public ManagerProductByMap() {
        hashtable=new Hashtable();
    }
    public ManagerProductByMap(int capa,float load) {
        hashtable=new Hashtable(capa,load);
    }
    public void addProduct(Product pro){
        if(!hashtable.containsKey(pro.getPid())){
          pro.setQuantity(1);
          hashtable.put(pro.getPid(),pro);
          
        }else{
            Product temp=(Product) hashtable.get(pro.getPid());
            pro.setQuantity(temp.getQuantity()+1);
            hashtable.put(pro.getPid(),pro);
        }
    }
}
