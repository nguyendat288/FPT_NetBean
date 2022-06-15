/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop37;

/**
 *
 * @author Admin
 */
public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;

    public Player() {
    }

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp,float yDisp){
        x +=xDisp;
        y +=yDisp;
    }
    public void jump(float zDisp){
        z+=zDisp;
    }
    public boolean near(Ball ball){
        if(this.x-ball.getX()>=8||this.x-ball.getX()<=-8){
            return true;
        }else return false;
    }
//     public void kick(Ball ball){
//        z+=zDisp;
//    }
}
