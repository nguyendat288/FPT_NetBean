/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Cart {
    private int accountid;
    private int productid;
    private int amount;

    public Cart() {
    }

    public Cart(int accountid, int productid, int amount) {
        this.accountid = accountid;
        this.productid = productid;
        this.amount = amount;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" + "accountid=" + accountid + ", productid=" + productid + ", amount=" + amount + '}';
    }
    
}
