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

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(this.capacity > item.weight()) {
            this.items.add(item);
            this.capacity -= item.weight();
        }
    }
    
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public double weight() {
        double weight = 0;
        for(Packable i : items) {
            weight += i.weight();
        }
        
        return weight;
    }
}
