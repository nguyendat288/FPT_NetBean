/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop4;

/**
 *
 * @author Admin
 */
public class Invoice {
    private int id ;
    private Customer customer;
    private double amount;

    public Invoice() {
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
 public int getCustomerID(){
     return customer.getID();
 }
 public String getCustomerName(){
     return customer.getName();
 }
 
 public int getCustomerDiscount(){
     return customer.getDiscount();
 }
 
 public double getAmountAfterDiscount(){
     return this.amount-this.amount * customer.getDiscount()/100  ;
 }
 
    @Override
    public String toString() {
        return "Invoice[" + "id=" + id + "," + customer + ", amount=" + amount + ']';
    }
    
}
 class TestMain {
   public static void main(String[] args) {
      // Test Customer class
      Customer c1 = new Customer(88, "Tan Ah Teck", 10);
      System.out.println(c1);  // Customer's toString()

      c1.setDiscount(8);
      System.out.println(c1);
      System.out.println("id is: " + c1.getID());
      System.out.println("name is: " + c1.getName());
      System.out.println("discount is: " + c1.getDiscount());

      // Test Invoice class
      Invoice inv1 = new Invoice(101, c1, 888.8);
      System.out.println(inv1);

      inv1.setAmount(999.9);
      System.out.println(inv1);
      System.out.println("id is: " + inv1.getID());
      System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
      System.out.println("amount is: " + inv1.getAmount());
      System.out.println("customer's id is: " + inv1.getCustomerID());
      System.out.println("customer's name is: " + inv1.getCustomerName());
      System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
      System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
   }
}