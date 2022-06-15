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
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }
public String getName() {
    return this.firstName+this.lastName;
          
}
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary *12;
    }
    public int raiseSalary(int percent){
        return this.salary*percent+this.salary;
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ']';
    }

   
    
}
