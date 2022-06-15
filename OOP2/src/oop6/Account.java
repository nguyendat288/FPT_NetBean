/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop6;

/**
 *
 * @author Admin
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id ,String name){
        this.name=name;
        this.id=id;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
    }

    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
public int credit(int amount){
this.balance=this.balance+amount;
   return this.balance ;
   }
public int debit( int amount){
    if(amount <=this.balance){
        this.balance=this.balance-amount;
        return this.balance;
    }else
        System.out.println("Amount exceeded balance");
        return this.balance;
}
public int transferTo(Account acc , int amount){
    if(this.balance>=amount){
        this.balance=this.balance-amount;
       acc.setBalance(acc.getBalance()+amount);
        return this.balance;
    }
    else return this.balance;
}
    @Override
    public String toString() {
        return "Account[" + "id=" + id + ", name=" + name + ", balance=" + balance + ']';
    }

}
