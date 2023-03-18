/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Book {
    private String name;
    private int recommendedAge;
    
    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getRecommendedAge() {
        return this.recommendedAge;
    }
    
    public String toString() {
        return this.name + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }
}
