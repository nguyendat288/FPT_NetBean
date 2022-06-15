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
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public int getX() {
        return x;
    }
    
public int[] getXY(){
    int[] arr={x,y};
    return arr;
}
public double distance(int x, int y) {
   int xDiff= this.x-x;
   int yDiff = this.y-y;
   return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}
public double distance(MyPoint another) {
   int xDiff= this.x - another.x;
   int yDiff= this.y - another.y;
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
}

public double distance() {
    return Math.sqrt(x*x + y*y);
}
    public void setX(int x) {
        this.x = x;
    }
    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

