/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop36;

/**
 *
 * @author Admin
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container() {
    }

    public Container(int x1, int y1, int width, int height) {
     set(x1,y1,width,height);
    }
    
    public void set(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width  - 1;
        y2 = y1 + height - 1;
    }
 public void setX(int x) {
        x1 = x;
    }
    public int getX() {
        return x1;
    }


    public void setY(int y) {
        y1 = y;
    }
    public int getY() {
        return y1;
    }


    public void setWidth(int width) {
        x2 = x1 + width - 1;
    }
    public int getWidth() {
        return (x2 - x1 + 1);
    }


    public void setHeight(int height) {
        y2 = y1 + height - 1;
    }
    public int getHeight() {
        return (y2 - y1 + 1);
    }
    public boolean collidesWith(Ball ball){
         if (ball.getX() - ball.getRadius() <= this.x1 ||
            ball.getX() + ball.getRadius() >= this.x2)
        {
            ball.reflectHorizontal();
            return true;
        }

        if (ball.getY() - ball.getRadius() <= this.y1 ||
            ball.getY() + ball.getRadius() >= this.y2)
        {
            ball.reflectVertical();
            return true;
        }

        return false;
    }
     public String toString() {
        return "Container  ("+ x1 +","+ y1 +") , ("+ x2 +", "+ y2 +")";
    }
     public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
Container box = new Container(0, 0, 100, 100);
for (int step = 0; step < 100; ++step) {
   ball.move();
   box.collidesWith(ball);
   System.out.println(ball);
    }
     }
}
