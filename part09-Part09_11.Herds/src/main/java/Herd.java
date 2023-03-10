/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    public String toString() {
        String result = "";
        for(Movable movable : this.herd) {
            result += movable.toString() + "\n";
        }
        
        return result;
    }
    
    public void move(int dx, int dy) {
        for(Movable movable : this.herd) {
            movable.move(dx, dy);
        }
    }
}
