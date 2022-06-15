/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop36;

public class Ball {
    private float   x;
    private float   y;
    private int     radius;
    private float   xDelta;
    private float   yDelta;

    public Ball() {
    }

    public Ball(float x, float y, int radius,int speed,int derection) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double direction = derection;
        this.xDelta =speed*(float)Math.cos(Math.toRadians(direction));
        this.yDelta = -speed*(float)Math.cos(Math.toRadians(direction));
    }
    public void setX(int x) {
         this.x = x;
    }
    public int getX() {
        return (int) this.x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return (int) this.y;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }

    public int getSpeed() {
        return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }
       
    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball(x,y)=("+  x +", "+ y +") ,speed = ("+ getSpeed() +")";
    }
      public static void main(String[] args) {
        Ball b = new Ball(50, 50, 30, 10, 45);

        System.out.println("The X coordinate of ball is: "+b.getX());
        System.out.println("The Y coordinate of ball is: "+b.getY());
        System.out.println("The Radius of ball is: "+b.getRadius());
        System.out.println(b);

        b.setX(100);
        b.setY(100);
        b.setRadius(20);
        System.out.println(b);

        b.setXY(200, 200);
        System.out.println(b);

        b.move();
        System.out.println(b);

        b.reflectHorizontal();
        b.move();
        System.out.println(b);

        b.reflectVertical();
        b.move();
        System.out.println(b);
    }
}
