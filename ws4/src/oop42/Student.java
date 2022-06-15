/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop42;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String progam;
    private int year;
    private double fee;

    public Student() {
    }

    public Student(String progam, int year, double fee) {
        this.progam = progam;
        this.year = year;
        this.fee = fee;
    }

    public Student(String progam, int year, double fee, String name, String address) {
        super(name, address);
        this.progam = progam;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[ " +super.toString() + "progam=" + progam + ", year=" + year + ", fee=" + fee + ']';
    }

    public String getProgam() {
        return progam;
    }

    public void setProgam(String progam) {
        this.progam = progam;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    
}
