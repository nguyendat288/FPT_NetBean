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
public class NvPartTime extends NhanVien {
    private int timework;

    public NvPartTime() {
    }

    public NvPartTime(int timework) {
        this.timework = timework;
    }

    public NvPartTime(int timework, int id, String name, int age, String gender, String phone, String email, boolean status, int salary) {
        super(id, name, age, gender, phone, email, status, salary);
        this.timework = timework;
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

     @Override
    public int doanhThu(){
        return this.getSalary()*this.timework;
    }
    @Override
    public String toString() {
        return "NvPartTime{"
                 + super.toString()+"timework = "+timework+
                '}';
    }
    
}
