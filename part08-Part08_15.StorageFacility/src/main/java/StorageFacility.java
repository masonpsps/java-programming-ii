/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnits.putIfAbsent(unit, new ArrayList<>());
        
        this.storageUnits.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if(!this.storageUnits.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        
        return this.storageUnits.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if(!this.storageUnits.containsKey(storageUnit)) {
            return;
        }
        if(!this.storageUnits.get(storageUnit).contains(item)) {
            return;
        }
        
        this.storageUnits.get(storageUnit).remove(item);
        
        if(this.storageUnits.get(storageUnit).size() == 0) {
            this.storageUnits.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        
        for(String unit : this.storageUnits.keySet()) {
            result.add(unit);
        }
        
        return result;
    }
}
