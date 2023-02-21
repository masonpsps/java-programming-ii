/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                return;
            }
            
            switch(command) {
                case "add":
                    System.out.println("To add:");
                    String toAdd = scanner.nextLine();
                    
                    todoList.add(toAdd);
                    break;
                case "list":
                    todoList.print();
                    break; 
                case "remove":
                    System.out.println("Which one is removed?");
                    int toRemove = Integer.valueOf(scanner.nextLine());
                    
                    todoList.remove(toRemove);
                    break;
                default:
                    break;
            }
        }
    }
}
