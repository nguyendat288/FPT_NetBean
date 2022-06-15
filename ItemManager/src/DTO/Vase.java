/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void outputVase(){
      output(); 
      System.out.println("Height:" + height);
      System.out.println("Material"+ material);

    }
    public void inputVase(){
       input();  
      Scanner sc = new Scanner(System.in);
        System.out.println("Input a height: ");
     height=sc.nextInt();
      System.out.println("Input a material: ");
      sc=new Scanner(System.in);
    material =sc.nextLine();
    }
    
}
