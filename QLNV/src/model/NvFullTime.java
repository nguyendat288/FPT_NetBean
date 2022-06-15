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
public class NvFullTime extends NhanVien{

    public NvFullTime() {
    }

    public NvFullTime( int id, String name, int age, String gender, String phone, String email, boolean status, int salary) {
        super(id, name, age, gender, phone, email, status, salary);
    }
     @Override
    public int doanhThu(){
        return this.getSalary()*8;
    }
    @Override
    public String toString() {
        return "NvFullTime{"
                 + super.toString()+
                '}';
    }
}
