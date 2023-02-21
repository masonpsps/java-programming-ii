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

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void remove(int number) {
        if(this.todoList.size() < number) {
            return;
        }
        this.todoList.remove(number - 1);
    }
    
    public void print() {
        String result = "";
        for(int i = 0; i < this.todoList.size(); i++ ) {
            result += (i + 1) + ": " + this.todoList.get(i) + "\n";
        }
        
        System.out.println(result);
    }
}
