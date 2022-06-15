/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop7;

/**
 *
 * @author Admin
 */
public class Date {
    private int day ;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day<=1 && day<=31)
        this.day = day;
        
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>0 && month<=12)
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >1990 && year <9999)
        this.year = year;
    }
public void setDate(int day,int month,int year){
     this.day = day;
        this.month = month;
        this.year = year;
}
    @Override
    public String toString() {
        if(day <10 || month <10){   
            if(day<10&& month>10){
             return "0"+ this.day+"/"+this.month+"/"+this.year;
        }
           else if(day>10&& month<10){
             return this.day+"/0"+this.month+"/"+this.year;
        }
           else if(day<10 && month<10){
             return "0"+ this.day+"/0"+this.month+"/"+this.year;
        }
        } else return this.day+"/"+this.month+"/"+this.year;
        return null;
        
    }
    
}
