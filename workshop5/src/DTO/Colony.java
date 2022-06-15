package DTO;


import DTO.Organization;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Colony extends Organization{
protected String place;

    public Colony( int size,String place) {
        super(size);
        this.place = place;
    }

    public Colony(String place) {
        this.place = place;
    }

    public Colony() {
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
public void grow(){
    System.out.println("an annual cycle of growth that begins in spring");
}
    @Override
    void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return "the colony size is" + size + ", the colony’s place is" + place;
    }
}
