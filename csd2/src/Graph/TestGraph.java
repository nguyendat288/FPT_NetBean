/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Admin
 */
public class TestGraph {
    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        int[][] b={
            {0,1,1,0,0,0},//a-b , a-c
            {1,0,0,1,0,0},//b-d
            {1,0,0,0,0,0},//
            {0,1,0,0,0,0},//
            {0,0,0,0,0,1},//e-f
            {0,0,0,0,1,0}};//e-f
        myGraph.setData(b);
        myGraph.display();
        myGraph.breadth(3);
        
        
        }
    
}
