/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
            return;
        }
        this.items.put(product, new Item(product, 1, price));
    }
    
    public int price() {
        int price = 0;
        for(Item item : this.items.values()) {
            price += item.price();
        }
        
        return price;
    }
    
    public void print() {
        String result = "";
        for(Item item : this.items.values()) {
            result += item.toString() + "\n";
        }
        
        System.out.println(result);
    }
}
