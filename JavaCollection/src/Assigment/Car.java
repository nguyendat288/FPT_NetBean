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
public class Car {
//    <ID, brand ID, color, frame ID, engine ID>
    private String id;
    private Brand brandID;
    private String color;
    private String frameID;
    private String engineID;

    public Car() {
    }

    public Car(String id, Brand brandID, String color, String frameID, String engineID) {
        this.id = id;
        this.brandID = brandID;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return  id + "," + brandID.getBrandID() + "," + color + "," + frameID + "," + engineID ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Brand getBrandID() {
        return brandID;
    }

    public void setBrandID(Brand brandID) {
        this.brandID = brandID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }
    
}
