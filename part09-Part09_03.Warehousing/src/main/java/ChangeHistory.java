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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history = new ArrayList<>();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if(this.history.isEmpty()) {
            return 0;
        }
        
        double max = this.history.get(0);
        for(Double val : this.history) {
            if(val > max) {
                max = val;
            }
        }
        
        return max;
    }
    
    public double minValue() { 
        if(this.history.isEmpty()) {
            return 0;
        }
        
        double min = this.history.get(0);
        for(Double val : this.history) {
            if(val < min) {
                min = val;
            }
        }
        
        return min;
    }
    
    public double average() {
        if(this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for(Double val : this.history) {
            sum += val;
        }
        
        return sum / this.history.size();
    }
}
