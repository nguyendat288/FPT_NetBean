/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flower;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("|-----------Chương trình quản lý hoa -----------------|");
            System.out.println("| 1.Thêm sản phẩm                                     |");
            System.out.println("| 2.Hiển thị sản phẩm                                 |");
            System.out.println("| 3.Sắp xếp sản phẩm theo giá                         |");
            System.out.println("| 4.Tìm kiếm sản phẩm theo tên                        |");
            System.out.println("| 5.Xoá sản phẩm                                      |");
            System.out.println("| 6.Thoát                                             |");
            System.out.println("|=====================================================|");
            System.out.print("Lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    ListFlower.addFlower();
                    break;
                case 2:
                    ListFlower.display();
                    break;
                case 3:
                    
                    ListFlower.sort();
                    break;
                case 4:
                    ListFlower.search();
                    break;
                case 5:
                  
                    ListFlower.delete();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
