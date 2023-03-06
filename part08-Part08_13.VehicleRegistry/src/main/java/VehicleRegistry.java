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

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if(!this.registry.containsKey(licensePlate)) {
            return null;
        }
        
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(!this.registry.containsKey(licensePlate)) {
            return false;
        }
        
        this.registry.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        String result = "";
        for(LicensePlate plate : registry.keySet()) {
            result += plate.toString() + "\n";
        }
        
        System.out.println(result);
    }
    
    public void printOwners() {
        String result = "";
        for(String person : this.registry.values()) {
            if(!result.contains(person)) {
                result += person + "\n";
            }
        }
        
        System.out.println(result);
    }
}
