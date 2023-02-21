/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Container {
    private int amt;
    
    public Container() {
        this.amt = 0;
    }
    
    public int contains() {
        return this.amt;
    }
    
    public void add(int toAdd) {
        if(toAdd < 0) {
            return;
        }
        this.amt = Math.min(this.amt + toAdd, 100);
    }
    
    public void remove(int toRemove) {
        if(toRemove < 0) {
            return;
        }
        this.amt = Math.max(this.amt - toRemove, 0);
    }
    
    public String toString() {
        return this.amt + "/100";
    }
}
