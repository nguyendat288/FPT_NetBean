/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment;

/**
 *
 * @author Admin
 */
public class Brand {
//    Brand ID, brand name, sound brand, price
    private String brandID;
    private String brandName;
    private String soundBrand;
    private float price;

    public Brand() {
    }
    public Brand(String brandID) {
    this.brandID = brandID;
    }

    public Brand(String brandID, String brandName, String soundBrand, float price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }

    @Override
    public String toString() {
        return   brandID + "," + brandName + "," + soundBrand + ":" + price ;
    }

    public String getBrandID() {
        return brandID;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
