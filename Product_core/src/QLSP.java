
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class QLSP {
    static Scanner sc = new Scanner(System.in);
    static File file = new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Product_core\\SanPham.txt");
    static ArrayList<SanPham> list = docFile();  
//============================================================================================    
    public static void ghiFile() throws IOException{
        BufferedWriter bufferedWriter = null;
        try{
            FileWriter fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
        for(SanPham p : list){
            bufferedWriter.write(p.ghi());
            bufferedWriter.newLine();
        }
        }catch(IOException e){
            e.printStackTrace();
        }finally{       
            bufferedWriter.close();
        }
    }
//    =====================================================================================
//    int id, String name, int price, int soluong, String mota
    public static ArrayList<SanPham> docFile(){
        ArrayList<SanPham> list1 = new ArrayList<SanPham>();
            try{
                if(!file.exists()){
                    file.createNewFile();
                }
                
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while((line = bufferedReader.readLine())!=null){
                    String[] str = line.split(",");
                  if(str.length>=5){
                      list1.add(new SanPham(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]), str[4]));
                  }                
                }
//                  for(SanPham x:list1){
//                System.out.println(x);
//            }
            }catch (IOException e ){
          e.printStackTrace();
            }
            return list1;
    }
//    =============================================================================
    public static void addProduct() throws IOException{
        System.out.print("Nhập tên sản phẩm : ");
        String name=sc.nextLine();
        System.out.print("Nhập mô tả về sản phẩm : ");
        String mota = sc.nextLine();
        list.add(new SanPham(ID.getId(),name,Price.getPrice(),Soluong.getSoluong(),mota));
        ghiFile();
    }
    public static void remove() throws IOException{
        System.out.print("Nhập id bạn muốn xoá : ");
        int id = Integer.parseInt(sc.nextLine());
        int index=-1;
        for(int i=0 ;i<list.size();i++){
            if(list.get(i).getId()==id){
                index =i;
                list.remove(i);
                i--;
            }
        }
        if(index==-1){
            System.out.println("Không có id bạn cần xoá !");
        }
        ghiFile();
    }
     public static void change()throws Exception {
        System.out.print("Nhập id bạn muốn sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        int index = -1;
        System.out.println("=======================//Nhập thông tin bạn muốn sửa//============================");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                System.out.println("Nhập tên ");
                String name=sc.nextLine();
                System.out.println("Nhập mô tả ");
                String mota=sc.nextLine();
                System.out.println();
                list.set(i,new SanPham(id,name,Price.getPrice(),Soluong.getSoluong(),mota));
            }
        }
        if (index == -1) {
            System.out.println("Không tồn tại id này !!!");
        }
        ghiFile();
    }
   public static void sort() throws IOException{
    Collections.sort(list, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sv1, SanPham sv2) {
                if (sv1.id < sv2.id) {
                    return -1;
                } else {
                    if (sv1.id == sv2.id) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
    ghiFile();
   }
    public static void max(){
        int max=list.get(0).getPrice();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPrice()>max){
                max=list.get(i).getPrice();
            }
        }
        System.out.println(list.get(max).toString());
    }
public static void show(){
        for(SanPham x:list){
            System.out.println(x);
        }
}
}
