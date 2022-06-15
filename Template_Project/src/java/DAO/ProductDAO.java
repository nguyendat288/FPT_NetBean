/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBContext.DBContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Category;
import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDAO {

    Connection conn = null; //ket noi toi sql server
    PreparedStatement ps = null; //nem cau lenh query tu netbean sang sql server
    ResultSet rs = null; //nhan ket qua tra v
ArrayList<Account> list = new ArrayList<>();
public ProductDAO(){
    list = getAllAccount();
}
    public List<Product> getAllProduct() {
        String query = "select * from product";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        String query = "select * from Category";
        List<Category> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getLastProduct() {
        String query = "select top 1 * from product order by id desc";
        Product p = new Product();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getDetail(int id) {
        String query = "select * from product where id = ? ";
        Product p = new Product();

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            ps.setInt(1, id);
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account getAccount(String user, String pass) {
        String query = "select * from Account where [user] = ? and pass = ? ";
        Account acc = new Account();

        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getBoolean(5)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }
    
      public ArrayList getAllAccount() {
        String query = "select * from Account";
         ArrayList<Account> listAccount = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            rs = ps.executeQuery(); // tra ve ket qua
            while (rs.next()) {
                  int uID = rs.getInt("uID");
                String username = rs.getString("user");
                String password = rs.getString("pass");
                Boolean isSell = rs.getBoolean("isSell");
                Boolean isAdmin = rs.getBoolean("isAdmin");
                listAccount.add(new Account(uID, username, password, isSell, isAdmin));   
            }
        } catch (Exception e) {
        }
        return listAccount;
    }
      public Boolean checkAccount(String user){
          for(Account x : list ){
              if(user.equals(x.getUser())){
                  return false;
              }
          }
          return true;
      }
      public Account SignUp(String user, String pass) {
        String query = "insert into Account values (?,?,1,0)";
        Account acc = new Account();
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query); //thuc thi cau lenh query
            ps.setString(1, user);
            ps.setString(2, pass);
            if(checkAccount(user)==true){
                ps.executeQuery();   
            }     
        } catch (Exception e) {
        }
        return null;
    }
    
}
