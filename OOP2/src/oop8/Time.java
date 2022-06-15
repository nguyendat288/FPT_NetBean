/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop8;

/**
 *
 * @author Admin
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

   public String toString() {
return String.format
("%02d:%02d:%02d", hour, minute, second);
}
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=0 && hour <24){
        this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >=0 && minute <=59){
        this.minute = minute;}
    }

    public int getSecond() {
        return second;
    }
public void setTime(int hour, int minute, int second){
         this.hour = hour;
        this.minute = minute;
        this.second = second;
}
    public void setSecond(int second) {
         if(second >=0 && second <=59){
        this.second = second;}
    }
    public Time nextSecond(){
++second;
if (second == 60) {
second =0;
++minute;
}
if (minute == 60) {
minute =0;
++ hour;
}
if (hour == 24) {
hour = 0;
}
return this;
}
     public Time previousSecond(){
--second;
if (second == 00) {
second =59;
--minute;
}
if (minute == 00) {
minute =59;
-- hour;
}
if (hour == 00) {
hour = 23;
}
return this;
}
}
