/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class FPTUniversity extends University implements Role{
private String address;

    public FPTUniversity( int size,String address, String name) {
        super(name, size);
        this.address = address;
    }

    public FPTUniversity(String address, String name) {
        super(name);
        this.address = address;
    }

    public FPTUniversity(String address) {
        this.address = address;
    }

    public FPTUniversity() {
    }

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    
}
