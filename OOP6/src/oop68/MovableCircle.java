/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop68;



public class MovableCircle implements Movable{
private int radius;
private  MovablePoint center;

     public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.y -= center.ySpeed;
    }

    public void moveDown() {
        center.y += center.ySpeed;
    }

    public void moveLeft() {
        center.x -=center.xSpeed ;
    }

    public void moveRight() {
        center.x += center.xSpeed;        
    }
    
    public String toString() {
        return "(x,y)= ("+center.x+","+center.y+"),speed =("+center.xSpeed+","+center.ySpeed+"), radius ="+radius;
    }
    
}
