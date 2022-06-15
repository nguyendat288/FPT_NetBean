/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap();
          map.put("1", "Java");
        map.put("2", "C++");
        map.put("3", "PHP");
        map.put("4", "Python");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập từ cần đổi : ");
        String a = sc.nextLine();
//        System.out.println(map.get(a));
        Set<String> keySet=map.keySet();
        for(String e:keySet){
            System.out.println("");
        }
    }
}
