/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Organism implements Movable {
    private int xPos;
    private int yPos;
    
    public Organism(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    
    public String toString() {
        return "x: " + this.xPos + "; y: " + this.yPos;
    }
    
    public void move(int dx, int dy) {
        this.xPos += dx;
        this.yPos += dy;
    }
}
