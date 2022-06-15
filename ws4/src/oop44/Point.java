/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop44;

/**
 *
 * @author Admin
 */
public class Point {
    private float x=0.0f ;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("  + x + "," + y + ')';
    }
 public void setXY(float x,float y){
               this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
}
