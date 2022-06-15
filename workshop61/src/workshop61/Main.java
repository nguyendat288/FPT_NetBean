/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop61;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("|-----------Chương trình quản lý xe ------------------|");
            System.out.println("| 1.Thêm sản phẩm                                     |");
            System.out.println("| 2.Hiển thị sản phẩm                                 |");
            System.out.println("| 3.Hiển thị số lượng sản phẩm                        |");
            System.out.println("| 4.Kiểm tra danh sách trống hay không                |");
            System.out.println("| 5.Xoá sản phẩm                                      |");
            System.out.println("| 6.Thoát                                             |");
            System.out.println("|=====================================================|");
            System.out.print("Lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    GenericCar.addCar();
                    break;
                case 2:
                    GenericCar.display();

                    break;
                case 3:
                    System.out.print("Số lượng sản phẩm trong danh sách là : ");
                    GenericCar.getSize();
                    break;
                case 4:
                    System.out.println(GenericCar.checkEmpty());
                    break;
                case 5:
                  
                    GenericCar.delete();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
