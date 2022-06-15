/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop43;

/**
 *
 * @author Admin
 */
public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z, float x, float y){
         setX(x);      
       setY(y);
       this.z = z;
    }
    public float[] getXYZ() {
       float[] result = new float[3]; 
       result[0] = getX();
       result[1] = getY();
       result[2] = getZ();
       return result; 
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+z+")";
    }
}
