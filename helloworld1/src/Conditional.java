
import java.util.*;
import java.util.Scanner;
class SoNgauNhien {
    public static void main(String[] args) {
        int[] arr = null;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn Random bao nhiêu số: ");
        n = scanner.nextInt();
        int counter;
        Random rnum = new Random();
        System.out.println("Các số Random là:");
        for (counter = 0; counter < n; counter++) {
            arr[counter]=rnum.nextInt(20);
//            System.out.println(rnum.nextInt(20));
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
