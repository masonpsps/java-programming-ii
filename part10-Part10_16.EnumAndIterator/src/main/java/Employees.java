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
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> people;
    
    public Employees() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> personToAdd) {
        personToAdd.stream()
                .forEach(person -> this.people.add(person));
    }
    
    public void print() {
//        this.people.stream()
//                .forEach(person -> System.out.println(person));

        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()) {
            Person nextInLine = iterator.next();
            System.out.println(nextInLine.toString());
        }
    }
    
    public void print(Education education) {
//        this.people.stream()
//                .forEach(person -> System.out.println(person.getEducation()));

        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine.toString());
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        
        while(iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
