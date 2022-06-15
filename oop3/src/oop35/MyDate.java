/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop35;

/**
 *
 * @author Admin
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] months={"Jan", "Feb", "Mar", "Apr", "May", "Jun" ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] days={"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
    private int[] dayinmonth={31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public boolean isValidDate(int year, int maonth, int day){
        return (1 <= year   && year  <= 9999)
            && (1 <= month  && month <= 12)
            && (1 <= day    && day   <= getMonthLastDay(year, month,dayinmonth));
    }
    public int getMonthLastDay(int year,int month,int[] dayinmonth){
        return dayinmonth[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }  
}
