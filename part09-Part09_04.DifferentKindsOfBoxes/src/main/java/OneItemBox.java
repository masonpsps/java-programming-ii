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

public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.capacity = 1;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if(this.capacity > 0) {
            this.capacity--;
            this.items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        for(Item i : this.items) {
            if(i.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
