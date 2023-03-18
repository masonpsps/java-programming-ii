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
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
//        this.cards.stream()
//                .forEach(card -> System.out.println(card.toString()));

        Iterator<Card> iterator = this.cards.iterator();
        
        while(iterator.hasNext()) {
            Card nextCard = iterator.next();
            System.out.println(nextCard);
        }
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        
        Collections.sort(cards, comparator);
    }
    
    @Override
    public int compareTo(Hand compare) {
//        int value = 0;
//        for(Card card : this.cards) {
//            this.v
//        }

        int value = this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (prev, next) -> prev + next);
        int compValue = compare.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (prev, next) -> prev + next);
        
        return value - compValue;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
