/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Teacher extends Person {
    private int monthlySalary;
    
    public Teacher(String name, String address, int monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }
    
    public int salary() {
        return this.monthlySalary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary() + " euro/month";
    }
}
