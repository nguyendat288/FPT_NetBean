/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop68;

/**
 *
 * @author Admin
 */
public class MovableRectangle  implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft     = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }  
      @Override
    public void moveUp() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.y     -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.y     += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.x     -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.x     += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    private boolean hasPointsSameSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed)
            && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }

   
}
