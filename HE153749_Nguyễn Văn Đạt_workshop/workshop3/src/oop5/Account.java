/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop5;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;

    public Account() {
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer+" balance = $"+balance ;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public void deposit(double amount){
        this.balance+= amount;
    }
       public void withdraw(double amount) {
        if(balance >= amount ){
            this.balance-=amount;
        }else System.out.println("amount withdrawn exeeds the current balance");
    }

}
